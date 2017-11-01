package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuInitial extends AppCompatActivity {

    ImageButton desligarButton;
    Button entrarButton;
    ImageButton background;

    Camera camara;
    Camera.Parameters param;

    Boolean litImage;
    Boolean enableFlash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_initial);

        enableFlash = isFlashSupported(getPackageManager()) && isCameraSupported(getPackageManager());

        background = (ImageButton) findViewById(R.id.background);
        litImage = true;

        desligarButton = (ImageButton) findViewById(R.id.desligarButton);
        entrarButton = (Button) findViewById(R.id.entrarButton);

        ViewTreeObserver observer = entrarButton.getViewTreeObserver();

        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @Override
            public void onGlobalLayout()
            {
                entrarButton.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                // Do what you need with yourView here...
                ViewGroup.LayoutParams params = desligarButton.getLayoutParams();
                Log.d("tag","entrar height = "+entrarButton.getHeight());
                params.height = entrarButton.getMeasuredHeight();
                desligarButton.setLayoutParams(params);
                //desligarButton.invalidate();
            }
        });

        // meter os onClickListener
        desligarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                litImage = !litImage;
                // alternar as imagens de background
                if(litImage)
                {
                    background.setImageResource(R.drawable.lanternaacesa);
                    background.setBackgroundColor(Color.parseColor("#ffffff"));
                    if(enableFlash)
                    {
                        param.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                        camara.setParameters(param);
                    }
                }
                else
                {
                    background.setImageResource(R.drawable.lanternaapagada);
                    // meter o brilho no máximo
                    background.setBackgroundColor(Color.parseColor("#000000"));
                    if(enableFlash)
                    {
                        param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                        camara.setParameters(param);
                    }
                }

            }
        });

        entrarButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tmp = new Intent(MenuInitial.this, MenuButtons.class);
                startActivity(tmp);
            }
        });

        //background.setImageResource(R.drawable.lanternaacesa);

        // dá out of memory porque a imagem é muito grande
        //Glide.with(MenuInitial.this).load(getResources().getDrawable(R.drawable.lanternaacesa2)).into((ImageButton)findViewById(R.id.background));
    }

    private boolean isFlashSupported(PackageManager packageManager){
        // if device support camera flash?
        return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    }


    private boolean isCameraSupported(PackageManager packageManager){
        // if device support camera?
        return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }


    @Override
    protected void onResume ()
    {
        super.onResume();

        if(enableFlash)
        {
            camara = Camera.open();
            param = camara.getParameters();
        }

        // ver qual a imagem a ser displayed e atualizar o flash
        if(enableFlash)
        {
            if(litImage) // apagar o flash
            {
                param.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                camara.setParameters(param);
            }
            else // acender o flash
            {
                param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camara.setParameters(param);
            }
        }
    }

    @Override
    protected void onStop ()
    {
        super.onStop();
        if(enableFlash) camara.release();
    }
}

package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.bestaveiro.innovationnow.Fotos.Fotografias;
import com.example.bestaveiro.innovationnow.Programa.programa;

public class MenuButtons extends AppCompatActivity {

    ImageButton arr[] = new ImageButton[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubuttons);

        // ir buscar os botões todos
        arr[0] = (ImageButton) findViewById(R.id.buttoninnov);
        arr[1] = (ImageButton) findViewById(R.id.buttonbest);
        arr[2] = (ImageButton) findViewById(R.id.buttonhorario);
        arr[3] = (ImageButton) findViewById(R.id.buttonparceiros);
        arr[4] = (ImageButton) findViewById(R.id.buttonatividades);
        arr[5] = (ImageButton) findViewById(R.id.buttonfotos);

        for(ImageButton a : arr)
        {
            a.setOnClickListener(listener);
        }
    }

    View.OnClickListener listener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int id = v.getId();
            Intent tmp;
            switch (id)
            {
                case R.id.buttoninnov:
                    tmp = new Intent(MenuButtons.this, Innov.class);
                    startActivity(tmp);
                    break;
                case R.id.buttonbest:
                    tmp = new Intent(MenuButtons.this, bestaveiro.class);
                    startActivity(tmp);
                    break;
                case R.id.buttonhorario:
                    tmp = new Intent(MenuButtons.this, programa.class);
                    startActivity(tmp);
                    break;
                case R.id.buttonparceiros:
                    tmp = new Intent(MenuButtons.this, Parceiros.class);
                    startActivity(tmp);
                    break;
                case R.id.buttonatividades:
                    tmp = new Intent(MenuButtons.this, Atividades.class);
                    startActivity(tmp);
                    break;
                case R.id.buttonfotos:
                    tmp = new Intent(MenuButtons.this, Fotografias.class);
                    startActivity(tmp);
                    break;
            }
        }
    };


}

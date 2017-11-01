package com.example.bestaveiro.innovationnow;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class SpeakerInfo extends AppCompatActivity {
    String[] all_names;

    String[] all_projects;

    String[] all_descriptions;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_speaker_info);
        position=getIntent().getIntExtra("position",0);
        getSupportActionBar().hide();



        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/AleoRegular.otf");

        //int[] imgs=new int[]{R.drawable.virgilio,R.drawable.rui,R.drawable.hugo,R.drawable.bruno};
        int[] imgs=new int[]{R.drawable.foto_2,R.drawable.foto_1,R.drawable.foto_3,R.drawable.foto_4,R.drawable.pedro_madureira,R.drawable.carlos_martins};
        all_names=getResources().getStringArray(R.array.nomesOradores);
        all_projects=getResources().getStringArray(R.array.titulosOradores);
        all_descriptions=getResources().getStringArray(R.array.descricaoOradores);

        ((ImageView) findViewById(R.id.fotoOrador)).setImageResource(imgs[position]);

        ((TextView) findViewById(R.id.NomeDoOrador)).setTypeface(tf);
        ((TextView) findViewById(R.id.NomeDoOrador)).setText(all_names[position]);

        ((TextView) findViewById(R.id.TituloOrador)).setTypeface(tf);
        ((TextView) findViewById(R.id.TituloOrador)).setText(all_projects[position]);

        ((TextView) findViewById(R.id.TextoOrador)).setTypeface(tf);
        ((TextView) findViewById(R.id.TextoOrador)).setText(all_descriptions[position]);

    }
}

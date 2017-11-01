package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Casestudy extends AppCompatActivity {
    String[] all_names;

    String[] all_projects;

    String[] all_descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casestudy);

        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/AleoRegular.otf");
        int[] imgs=new int[]{R.drawable.foto_2,R.drawable.foto_1,R.drawable.foto_3,R.drawable.foto_4,R.drawable.pedro_madureira,R.drawable.carlos_martins,
                R.drawable.cocktail_edit,R.drawable.discuss_edit,R.drawable.putch,R.drawable.roundtable_edit,R.drawable.showroom_edit};
        all_names=getResources().getStringArray(R.array.nomesOradores);
        all_projects=getResources().getStringArray(R.array.titulosOradores);
        all_descriptions=getResources().getStringArray(R.array.descricaoOradores);

        ((ImageView) findViewById(R.id.fotoOrador2)).setImageResource(imgs[8]);
        ((TextView) findViewById(R.id.NomeDoOrador2)).setTypeface(tf);
        ((TextView) findViewById(R.id.NomeDoOrador2)).setText(all_names[9]);

        ((TextView) findViewById(R.id.TituloOrador2)).setTypeface(tf);
        ((TextView) findViewById(R.id.TituloOrador2)).setText(all_projects[9]);

        ((TextView) findViewById(R.id.TextoOrador2)).setTypeface(tf);
        ((TextView) findViewById(R.id.TextoOrador2)).setText(all_descriptions[9]);
    }
}

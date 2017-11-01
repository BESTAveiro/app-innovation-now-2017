package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.bestaveiro.innovationnow.Programa.OradoresActivity;

public class Atividades extends AppCompatActivity {

    public Button but1;
    public Button but3;
    public Button but4;
    public Button but5;
    public ImageButton butin;


    public void init(){
        but5 = (Button) findViewById(R.id.angry_btn5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(getApplicationContext(),Cocktail.class);
                startActivity(b5);
            }
        });


        but4 = (Button) findViewById(R.id.angry_btn4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(getApplicationContext(),Pitching.class);
                startActivity(b4);
            }
        });




        but1 = (Button) findViewById(R.id.angry_btn);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(getApplicationContext(),OradoresActivity.class);
                startActivity(b1);
            }
        });

        but3 = (Button) findViewById(R.id.angry_btn3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt = new Intent(getApplicationContext(),Casestudy.class);
                startActivity(bt);
            }
        });

        butin = (ImageButton) findViewById(R.id.image4);
        butin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(getApplicationContext(), MenuButtons.class);
                startActivity(b5);
            }
        });


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades);
        init();
    }
}

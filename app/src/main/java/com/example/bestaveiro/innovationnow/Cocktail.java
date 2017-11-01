package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cocktail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail);

        ImageButton but1 = (ImageButton) findViewById(R.id.image4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(getApplicationContext(), MenuButtons.class);
                startActivity(b5);
            }
        });
    }
}

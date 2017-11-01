package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pitching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitching);

        ImageButton buttt1 = (ImageButton) findViewById(R.id.image3);
        buttt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(getApplicationContext(), MenuButtons.class);
                startActivity(b5);
            }
        });
    }
}

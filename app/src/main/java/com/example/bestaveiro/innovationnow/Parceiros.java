package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Parceiros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parceiros);    }


    public void gototugaBox(View view) { goToUrl("https://www.tugabox.pt/?lang=en-en");    }

    public void gotoitGrow(View view) { goToUrl("www.itgrow.pt/");    }

    public void gotoshoyce(View view) { goToUrl("shoyce.pt/pt/");    }

    public void gotomirtiflor(View view) { goToUrl("https://pt-pt.facebook.com/Mirtiflor-745004355521875/");    }



    public void gotoua(View view) {
        goToUrl("https://www.ua.pt/");
    }

    public void gotoipdj(View view) {
        goToUrl("http://www.ipdj.pt/");
    }

    public void gotoaauav(View view) {
        goToUrl("http://www.aauav.pt/");
    }


    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
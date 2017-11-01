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
        setContentView(R.layout.activity_parceiros);
    }

    public void gotoefacec (View view) {
        goToUrl ( "http://www.efacec.pt/");
    }
    public void gotomicro (View view) {
        goToUrl ( "https://www.microsoft.com/pt-pt/");
    }
    public void gotokic1 (View view) {
        goToUrl ( "https://eit.europa.eu/eit-community/kic-innoenergy");
    }
    public void gotohovione (View view) {
        goToUrl ( "http://www.hovione.pt/");
    }
    public void gotoogmedical (View view) {
        goToUrl ( "http://ogmedical.pt/index.php?lang=pt&mod=home");
    }
    public void gotologoporto (View view) {
        goToUrl ( "http://www.myportocruz.com/");
    }
    public void gotovadia (View view) {
        goToUrl ( "http://www.cervejavadia.pt/site/");
    }
    public void gotofrei (View view) {
        goToUrl ( "http://freituck.com/");
    }
    public void gotocanal (View view) {
        goToUrl ( "http://www.canalsuperior.pt/");
    }
    public void gotodoit (View view) {
        goToUrl ( "http://www.doit.pt/");
    }
    public void gotoasf (View view) {
        goToUrl ( "http://www.asformacao.com/");
    }
    public void gotokopy (View view) {
        goToUrl ( "http://www.kopystation.pt/");
    }
    public void gotoholmes (View view) {
        goToUrl ( "http://holmesplace.pt/pt/");
    }
    public void gotoprint2 (View view) {
        goToUrl ( "http://www.print4fun3d.com/");
    }
    public void gotoindasa (View view) {
        goToUrl ( "https://www.indasa-abrasives.com/");
    }
    public void gotolatina (View view) {
        goToUrl ( "https://www.facebook.com/pastelarialatina.aveiro/");
    }
    public void gotoordem (View view) {
        goToUrl ( "http://www.ordemengenheiros.pt/pt/");
    }
    public void gotoua (View view) {
        goToUrl ( "https://www.ua.pt/");
    }
    public void gotoipd (View view) {
        goToUrl ( "http://www.ipdj.pt/");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

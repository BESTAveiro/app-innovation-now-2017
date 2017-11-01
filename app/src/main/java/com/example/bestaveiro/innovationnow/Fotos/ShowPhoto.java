package com.example.bestaveiro.innovationnow.Fotos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bestaveiro.innovationnow.R;

import java.io.File;

import uk.co.senab.photoview.PhotoViewAttacher;


public class ShowPhoto extends AppCompatActivity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_photo);

        // get intent
        Bundle args = getIntent().getExtras();
        final String photoFile = args.getString("photo");

        ImageView iv = (ImageView) findViewById(R.id.imageFullScreen);
        Glide.with(this).load(photoFile).asBitmap().into(iv);
        PhotoViewAttacher mAttacher = new PhotoViewAttacher(iv);

        ImageView toShare = (ImageView) findViewById(R.id.imageShare);
        toShare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(photoFile)));
                shareIntent.setType("image/*");
                startActivity(Intent.createChooser(shareIntent, "Onde Deseja Partilhar?"));
            }
        });
    }
}

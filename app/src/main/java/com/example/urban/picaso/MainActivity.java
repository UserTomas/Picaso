package com.example.urban.picaso;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        ImageView img = (ImageView) findViewById(R.id.imageView);


        Picasso.with(this)
                .load("https://m.smedata.sk/api-media/media/image/sme/7/27/2788337/2788337_970x647.jpeg?rev=2")
                .into(img);

//        Picasso.with(context).load("https://m.smedata.sk/api-media/media/image/sme/7/27/2788337/2788337_970x647.jpeg?rev=2").into(img);
    }
}

package com.example.aid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonPage extends AppCompatActivity {
    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        img1 = findViewById(R.id.engasgo_crianca);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.video.search.yahoo.com/search/video;_ylt=AwrNPcvIquJjjUoShhvz6Qt.;_ylu=Y29sbwNiZjEEcG9zAzEEdnRpZAMEc2VjA3BpdnM-?p=desengasgo+crian%C3%A7a&fr2=piv-web&type=E210BR91199G0&fr=mcafee#id=12&vid=b2ffef4ddd8fa9845cb610ded6e65636&action=view"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.yahoo");
                startActivity(intent);
            }
        });

        img2 = findViewById(R.id.engasgo_adulto);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nVztTfKBT6M"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img3 = findViewById(R.id.engasgo_gest_obesos);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WXS94fjyMt8"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img4 = findViewById(R.id.sagramento_nasal);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0LjVVK98RaE"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img5 = findViewById(R.id.sangramento);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2IEJyLwoxpw"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img6 = findViewById(R.id.membros_cortados);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jD47HMMGJ8k"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img7 = findViewById(R.id.queimaduras);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4-z7oeT7na0"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img8 = findViewById(R.id.desmaio);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RHJ27tMZI6I"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img9 = findViewById(R.id.convulsao);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sncxos5ojEY"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img10 = findViewById(R.id.parada);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jOFWyuOZBWE"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img11 = findViewById(R.id.choque);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=g4-hHMjkeR4"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        img12 = findViewById(R.id.avulsao);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Cn10PUH6DR4"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

    }

}


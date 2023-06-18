package com.example.aid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.Theme_CartilhaFinal);
        setContentView(R.layout.activity_page);
    }

    public void openAid(View view){
        Intent intent = new Intent(this, ButtonPage.class);
        startActivity(intent);
    }

    public void openInfo(View view){
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }
}


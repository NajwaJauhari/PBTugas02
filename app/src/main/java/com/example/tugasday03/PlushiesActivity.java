package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PlushiesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plushies);

        ImageView imgP1 = findViewById(R.id.imgP1);
        ImageView imgP2 = findViewById(R.id.imgP2);
        ImageView imgP3 = findViewById(R.id.imgP3);
        ImageView imgP4 = findViewById(R.id.imgP4);
        ImageView imgP5 = findViewById(R.id.imgP5);
        Button btnP1 = findViewById(R.id.btnP1);
        Button btnP2 = findViewById(R.id.btnP2);
        Button btnP3 = findViewById(R.id.btnP3);
        Button btnP4 = findViewById(R.id.btnP4);
        Button btnP5 = findViewById(R.id.btnP5);

        imgP1.setOnClickListener(this);
        imgP2.setOnClickListener(this);
        imgP3.setOnClickListener(this);
        imgP4.setOnClickListener(this);
        imgP5.setOnClickListener(this);
        btnP1.setOnClickListener(this);
        btnP2.setOnClickListener(this);
        btnP3.setOnClickListener(this);
        btnP4.setOnClickListener(this);
        btnP5.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgP1 || v.getId() == R.id.btnP1){
            detail.setSpecific("Size : 23cm, 35cm, 45cm, 60cm\nColor : Red\n");
            detail.setPrice("Price : Rp 286.000,00");
            detail.setImage("p1");
            intent = new Intent(PlushiesActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgP2 || v.getId() == R.id.btnP2) {
            detail.setSpecific("Size : 63x65cm, 72x75cm\nColor : Pink, Green, Orange, White\n");
            detail.setPrice("Price : Rp 694.000,00");
            detail.setImage("p2");
            intent = new Intent(PlushiesActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgP3 || v.getId() == R.id.btnP3) {
            detail.setSpecific("Type : Plush/Nano Doll\nSize : 50cm, 80cm, 100cm, 120cm, 150cm\nColor : Grey, Blue\n");
            detail.setPrice("Price : Rp 347.000,00");
            detail.setImage("p3");
            intent = new Intent(PlushiesActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgP4 || v.getId() == R.id.btnP4) {
            detail.setSpecific("Size : Approx 15x21cm\nColor : Yellow, Pink, Khaki, Green\n");
            detail.setPrice("Price : Rp 225.000,00");
            detail.setImage("p4");
            intent = new Intent(PlushiesActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgP5 || v.getId() == R.id.btnP5) {
            detail.setSpecific("Size : 50cm, 70cm, 90cm, 110cm, 130cm\nColor : 01-02\n");
            detail.setPrice("Price : Rp 409.000,00");
            detail.setImage("p5");
            intent = new Intent(PlushiesActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}
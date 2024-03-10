package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivFashion = findViewById(R.id.ivFashion);
        ImageView ivPlushies = findViewById(R.id.ivPlushies);
        ImageView ivMakeUp = findViewById(R.id.ivMakeUp);
        Button btnFashion = findViewById(R.id.btnFashion);
        Button btnPlushies = findViewById(R.id.btnPlushies);
        Button btnMakeUp = findViewById(R.id.btnMakeUp);

        ivFashion.setOnClickListener(this);
        ivPlushies.setOnClickListener(this);
        ivMakeUp.setOnClickListener(this);
        btnFashion.setOnClickListener(this);
        btnPlushies.setOnClickListener(this);
        btnMakeUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivFashion || v.getId() == R.id.btnFashion){
            Intent intent = new Intent(this, FashionActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.ivPlushies || v.getId() == R.id.btnPlushies) {
            Intent intent = new Intent(this, PlushiesActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.ivMakeUp || v.getId() == R.id.btnMakeUp) {
            Intent intent = new Intent(this, MakeUpActivity.class);
            startActivity(intent);
        }
    }
}
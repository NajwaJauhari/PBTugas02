package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MakeUpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_up);

        ImageView imgMk1 = findViewById(R.id.imgMk1);
        ImageView imgMk2 = findViewById(R.id.imgMk2);
        ImageView imgMk3 = findViewById(R.id.imgMk3);
        ImageView imgMk4 = findViewById(R.id.imgMk4);
        ImageView imgMk5 = findViewById(R.id.imgMk5);

        Button btnMk1 = findViewById(R.id.btnMk1);
        Button btnMk2 = findViewById(R.id.btnMk2);
        Button btnMk3 = findViewById(R.id.btnMk3);
        Button btnMk4 = findViewById(R.id.btnMk4);
        Button btnMk5 = findViewById(R.id.btnMk5);

        imgMk1.setOnClickListener(this);
        imgMk2.setOnClickListener(this);
        imgMk3.setOnClickListener(this);
        imgMk4.setOnClickListener(this);
        imgMk5.setOnClickListener(this);
        btnMk1.setOnClickListener(this);
        btnMk2.setOnClickListener(this);
        btnMk3.setOnClickListener(this);
        btnMk4.setOnClickListener(this);
        btnMk5.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgMk1 || v.getId() == R.id.btnMk1){
            detail.setSpecific("Type : Makeup Set\nQuantity : 1 pc\n");
            detail.setPrice("Price : Rp 797.000,00");
            detail.setImage("mk1");
            intent = new Intent(MakeUpActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgMk2 || v.getId() == R.id.btnMk2) {
            detail.setSpecific("Type : Lip gloss\nQuantity : 1 pc\nColor : 01-13\n");
            detail.setPrice("Price : Rp 245.000,00");
            detail.setImage("mk2");
            intent = new Intent(MakeUpActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgMk3 || v.getId() == R.id.btnMk3) {
            detail.setSpecific("Type : Palette\nQuantity : 1 pc (9 shades)\nColor : 01-03\n");
            detail.setPrice("Price : Rp 347.000,00");
            detail.setImage("mk3");
            intent = new Intent(MakeUpActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgMk4 || v.getId() == R.id.btnMk4) {
            detail.setSpecific("Type : Makeup Storage Boxes, Desktop Storage Box\nSize : 38 x 28 CM\nColor : 01-02\n");
            detail.setPrice("Price : Rp 1.082.000,00");
            detail.setImage("mk4");
            intent = new Intent(MakeUpActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgMk5 || v.getId() == R.id.btnMk5) {
            detail.setSpecific("Type : False Nail Kit\nQuantity : 24 pieces (1 kit)\n");
            detail.setPrice("Price : Rp 164.000,00");
            detail.setImage("mk5");
            intent = new Intent(MakeUpActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}
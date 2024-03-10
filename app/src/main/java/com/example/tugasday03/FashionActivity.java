package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FashionActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        ImageView ivFashion1 = findViewById(R.id.ivFashion1);
        ImageView ivFashion2 = findViewById(R.id.ivFashion2);
        ImageView ivFashion3 = findViewById(R.id.ivFashion3);
        ImageView ivFashion4 = findViewById(R.id.ivFashion4);
        ImageView ivFashion5 = findViewById(R.id.ivFashion5);

        Button btnKf1 = findViewById(R.id.btnKf1);
        Button btnKf2 = findViewById(R.id.btnKf2);
        Button btnKf3 = findViewById(R.id.btnKf3);
        Button btnKf4 = findViewById(R.id.btnKf4);
        Button btnKf5 = findViewById(R.id.btnKf5);

        ivFashion1.setOnClickListener(this);
        ivFashion2.setOnClickListener(this);
        ivFashion3.setOnClickListener(this);
        ivFashion4.setOnClickListener(this);
        ivFashion5.setOnClickListener(this);
        btnKf1.setOnClickListener(this);
        btnKf2.setOnClickListener(this);
        btnKf3.setOnClickListener(this);
        btnKf4.setOnClickListener(this);
        btnKf5.setOnClickListener(this);

    }
    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        Detail detail = new Detail();
        if (v.getId() == R.id.ivFashion1 || v.getId() == R.id.btnKf1){
            detail.setSpecific("Size : S-XL\nColor : Pink, light green, Black, White, Blue\n");
            detail.setPrice("Price : Rp 633.000,00");
            detail.setImage("kf1");
            intent = new Intent(FashionActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.ivFashion2 || v.getId() == R.id.btnKf2) {
            detail.setSpecific("Size : Inner Diameter 14.5-15\nColor : Brown\n");
            detail.setPrice("Price : Rp 286.000,00");
            detail.setImage("kf2");
            intent = new Intent(FashionActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.ivFashion3 || v.getId() == R.id.btnKf3) {
            detail.setSpecific("Size : S-L\nColor : Blue\n");
            detail.setPrice("Price : Rp 613.000,00");
            detail.setImage("kf3");
            intent = new Intent(FashionActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.ivFashion4 || v.getId() == R.id.btnKf4) {
            detail.setSpecific("Size : 80x100cm, 120x160cm\nColor : Orange\n");
            detail.setPrice("Price : Rp 801.000,00");
            detail.setImage("kf4");
            intent = new Intent(FashionActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.ivFashion5 || v.getId() == R.id.btnKf5) {
            detail.setSpecific("Size : One Size\nColor : Pink, Beige, Black, Gray, Blue\n");
            detail.setPrice("Price : Rp 654.000,00");
            detail.setImage("kf5");
            intent = new Intent(FashionActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}
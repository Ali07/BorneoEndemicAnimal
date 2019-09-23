package com.example.borneoendemicsanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class AnimalDetail extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAME_LATIN = "extra_latin";
    public static final String EXTRA_FILUM = "extra_filum";
    public static final String EXTRA_KELAS = "extra_kelas";
    public static final String EXTRA_ORDO = "extra_ordo";
    public static final String EXTRA_FAMILI = "extra_famili";
    public static final String EXTRA_GENUS = "extra_genus";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        ImageView imgDetail = findViewById(R.id.img_photo_detail);
        TextView tvNameAnimal = findViewById(R.id.tv_item_animal_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        TextView tvNameLatin = findViewById(R.id.tv_name_latin);
        TextView tvFilum = findViewById(R.id.tv_item_filum);
        TextView tvKelas = findViewById(R.id.tv_item_kelas);
        TextView tvOrdo = findViewById(R.id.tv_item_ordo);
        TextView tvFamili = findViewById(R.id.tv_item_famili);
        TextView tvGenus = findViewById(R.id.tv_item_genus);

        String nameAnimal = getIntent().getStringExtra(EXTRA_NAME);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);
        String Detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String nameLatin = getIntent().getStringExtra(EXTRA_NAME_LATIN);
        String filum = getIntent().getStringExtra(EXTRA_FILUM);
        String kelas = getIntent().getStringExtra(EXTRA_KELAS);
        String ordo = getIntent().getStringExtra(EXTRA_ORDO);
        String famili = getIntent().getStringExtra(EXTRA_FAMILI);
        String genus = getIntent().getStringExtra(EXTRA_GENUS);

        tvNameAnimal.setText(nameAnimal);
        Glide.with(AnimalDetail.this.getApplicationContext())
                .load(photo)
                .into(imgDetail);
        tvDetail.setText(Detail);
        tvNameLatin.setText(nameLatin);
        tvFilum.setText(filum);
        tvKelas.setText(kelas);
        tvOrdo.setText(ordo);
        tvFamili.setText(famili);
        tvGenus.setText(genus);

    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return true;
    }
}

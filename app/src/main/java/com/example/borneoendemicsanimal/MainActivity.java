package com.example.borneoendemicsanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.rv_animals);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalsData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.user:
                Intent aboutIntent = new Intent(MainActivity.this, About.class);
                startActivity(aboutIntent);
                break;
        }

        return true;
    }

    private void showRecyclerList() {
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list);
        rvAnimals.setAdapter(listAnimalAdapter);

        listAnimalAdapter.setOnItemClickCallback(new ListAnimalAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Animal data) {
                showSelectedAnimal(data);
            }
        });
    }

    private void showSelectedAnimal(Animal data) {
        Intent animalDetailIntent = new Intent(MainActivity.this, AnimalDetail.class);
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_NAME, data.getName());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_PHOTO, data.getPhoto());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_NAME_LATIN, data.getNameLatin());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_DETAIL, data.getDetail());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_FAMILI, data.getFamili());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_KELAS, data.getKelas());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_ORDO, data.getOrdo());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_FILUM, data.getFilum());
        animalDetailIntent.putExtra(AnimalDetail.EXTRA_GENUS, data.getGenus());
        startActivity(animalDetailIntent);
    }
}

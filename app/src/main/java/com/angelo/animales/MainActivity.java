package com.angelo.animales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.angelo.animales.model.Acuatico;
import com.angelo.animales.model.Animal;
import com.angelo.animales.model.Terrestre;
import com.angelo.animales.model.Volador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animal> Animales = new ArrayList<>();
    ListView listAnimales;
    private Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listAnimales = findViewById(R.id.listAnimales);
        GenerarAnimales();
        CargarAnimales();

        listAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemPresionado(parent, position);
            }
        });
    }

    public void GenerarAnimales(){
        Animal a1, a2, a3;
        a1 = new Terrestre(1, "Gato", "Terrestre", "Urbano", "Carnivoro", "Crias", "1000");
        a2 = new Acuatico(2, "Pez Gato", "Acuatico", "Oceano", "Omnivoro", "Huevos", "3000");
        a3 = new Volador(3, "Aguila", "Volador", "Montaña", "Carnivoro", "Huevos", "2000");

        Animales.add(a1);
        Animales.add(a2);
        Animales.add(a3);
    }

    public void CargarAnimales(){
        ArrayAdapter<Animal> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Animales);
        listAnimales.setAdapter(adapter);
    }

    public void ItemPresionado(AdapterView<?> adapterView, int index){
        Animal animalSeleccionado = (Animal) adapterView.getItemAtPosition(index);
        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
        intent.putExtra("animal", animalSeleccionado);
        startActivity(intent);
    }

    //Fragmentos

}
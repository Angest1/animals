package com.angelo.animales;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.EditText;

import com.angelo.animales.model.Acuatico;
import com.angelo.animales.model.Animal;
import com.angelo.animales.model.Terrestre;
import com.angelo.animales.model.Volador;

public class DetalleActivity extends AppCompatActivity {
    private Animal animal;
    private EditText txtIdA, txtNombreA, txtTipoA, txtZonaA, txtAlimentacionA, txtReproduccionA, txtEspecificoA;
    private String hola, mundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txtIdA = findViewById(R.id.txtID);
        txtNombreA = findViewById(R.id.txtNombre);
        txtTipoA = findViewById(R.id.txtTipo);
        txtZonaA = findViewById(R.id.txtZona);
        txtAlimentacionA = findViewById(R.id.txtAlimentacion);
        txtReproduccionA = findViewById(R.id.txtReproduccion);
        txtEspecificoA = findViewById(R.id.txtEspecifico);

        hola = "jelou";
        mundo = "world";

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        animal = (Animal) bundle.get("animal");

        txtIdA.setText("ID: "+String.valueOf(animal.getId()));
        txtNombreA.setText("Nombre: "+animal.getNombre());
        txtTipoA.setText("Tipo: "+animal.getTipo());
        txtZonaA.setText("Zona: " + animal.getZona());
        txtAlimentacionA.setText("Alimentacion: "+animal.getAlimentacion());
        txtReproduccionA.setText("Reproduccion: "+animal.getReproduccion());

        if(animal.getTipo().equals("Terrestre")){
            Terrestre terrestre = (Terrestre) animal;
            txtEspecificoA.setText("Rango: "+String.valueOf(terrestre.getRecorrido())+" metros");
        }else if(animal.getTipo().equals("Acuatico")){
            Acuatico acuatico = (Acuatico) animal;
            txtEspecificoA.setText("Rango: "+String.valueOf(acuatico.getProfundidad())+" metros de profundidad");
        }else{
            Volador volador = (Volador) animal;
            txtEspecificoA.setText("Rango: "+String.valueOf(volador.getAltura())+" metros de altura");
        }
    }
}
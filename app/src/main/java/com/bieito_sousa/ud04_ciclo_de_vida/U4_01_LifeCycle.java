package com.bieito_sousa.ud04_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class U4_01_LifeCycle extends AppCompatActivity {

    private void gestionarEventos(){
        Button btnFinalizar = findViewById(R.id.btnFinalizar_UD03_01_CicloVida);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Se ejecuta: onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Se ejecuta: onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Se ejecuta: onPause. Aprovechar para guardar información por si se destruye", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Se ejecuta: onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Se ejecuta: onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Se ejecuta: onDestroy. Salimos", Toast.LENGTH_SHORT).show();
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4_01_life_cycle);
        Toast.makeText(this, "Se ejecuta: onCreate. Aprovechar para recuperar la info de la última sesión", Toast.LENGTH_SHORT).show();
        gestionarEventos();
    }
}
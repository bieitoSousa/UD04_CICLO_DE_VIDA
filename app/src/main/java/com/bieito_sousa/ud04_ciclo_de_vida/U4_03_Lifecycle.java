package com.bieito_sousa.ud04_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class U4_03_Lifecycle extends AppCompatActivity {

    Bundle dato = new Bundle();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4_03_lifecycle);
        Toast.makeText(this, "Se ejecuta: onCreate. Aprovechar para recuperar la info de la última sesión", Toast.LENGTH_SHORT).show();
        gestionarEventos();
    }
    @Override
    protected void onSaveInstanceState(Bundle estado) {
        EditText et = (EditText) findViewById(R.id.etDato_UD03_01_CicloVida);
        estado.putString("VALOR_EDIT_TEXT", et.getText().toString());
        super.onSaveInstanceState(estado);
        Toast.makeText(this, "Guardado el estado: "+et.getText(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        EditText et = (EditText) findViewById(R.id.etDato_UD03_01_CicloVida);
        et.setText(savedInstanceState.getString("VALOR_EDIT_TEXT"));
        Toast.makeText(this, "Recreando", Toast.LENGTH_SHORT).show();
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
    private void gestionarEventos(){
        Button btnFinalizar = findViewById(R.id.btnFinalizar_UD03_01_CicloVida);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
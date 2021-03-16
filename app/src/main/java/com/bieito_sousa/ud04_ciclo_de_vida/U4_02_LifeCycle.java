package com.bieito_sousa.ud04_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class U4_02_LifeCycle extends AppCompatActivity {
    private int valor = 0;
    @Override
    protected void onSaveInstanceState(Bundle datosgardados){
        datosgardados.putInt("VALOR",valor);
        // SIEMPRE EL CODIGO PUESTO POR NOSOTROS ANTES DE LA LLAMADA A SUPER.
        super.onSaveInstanceState(datosgardados);
    }
    @Override
    protected void onRestoreInstanceState(Bundle datosgardados){
        super.onRestoreInstanceState(datosgardados);
        // CODIGO PUESTO PARA RECUPERAR LOS DATOS, SIEMPRE DESPUES DE
        // LA LLAMADA A SUPER
        valor = datosgardados.getInt("VALOR");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4_02_life_cycle);
        Button btnBoton1 = findViewById(R.id.btnBoton1_UD03_02_CicloVida);
        btnBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = 5;
                Toast.makeText(getApplicationContext(), "Valor: " + valor, Toast.LENGTH_LONG).show();
            }
        });
        Button btnBoton2 = findViewById(R.id.btnBoton2_UD03_02_CicloVida);
        btnBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Valor: " + String.valueOf(valor), Toast.LENGTH_LONG).show();
            }
        });
    }
}
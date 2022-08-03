package com.rocio.beeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {
    //en esta zona voy a decrararar las variables
    Button  btncuadrado,btntriangulo,btnrectangulo;
    TextView titulo1;



    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //en esta zona escribo instrucciones para que se ejecuten en la aplicacion
        super.onCreate(savedInstanceState);
        // REFERENCIAR agregar id
        setContentView(R.layout.activity_inicio);
        btncuadrado=findViewById(R.id.btnCuadrado);
        btntriangulo=findViewById(R.id.btnTriangulo);
        btnrectangulo=findViewById(R.id.btnRectangulo);
        titulo1=findViewById(R.id.titulo1);
//-----------------------------------------------------------------------//
                                       //TITULOS

      //TITULO1
        titulo1.setTextColor(getResources().getColor(R.color.green));
        titulo1.setTextSize(40);

//-----------------------------------------------------------------------//

                                       //BOTONES

        //botoncuadrado//
        btncuadrado.setText("calcular area del cuadrado");
        btncuadrado.setTextColor(getResources().getColor(R.color.yellow));
        btncuadrado.setTextSize(20);
        btncuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(InicioActivity.this, splash.class);
                startActivity(intent);
            }
        });

        //btntriangulo//


//---------------------------------------------------------------------------------------
                                      //IMAGENES




//-----------------------------------------------------------------------//


    }
}
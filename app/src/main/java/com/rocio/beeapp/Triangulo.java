package com.rocio.beeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Triangulo extends AppCompatActivity {
    Button btnmenú;
    TextView txttriangulo,txtrstriangulo;
    ImageView imgtriangulo;
    Button btncalcular;
    EditText edtbase,edtaltura;
    int total,base,altura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





      btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                base=Integer.parseInt(edtbase.getText().toString());
                altura=Integer.parseInt(edtaltura.getText().toString());
                total=(base*altura)/2;
                txtrstriangulo.setText("el area del triangulo es:  " + total);


            }
        });


        btnmenú.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Triangulo.this,InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}
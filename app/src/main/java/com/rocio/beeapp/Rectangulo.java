package com.rocio.beeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rectangulo extends AppCompatActivity {
    Button btnmenú;
    TextView txtrectangulo,txtrsrectangulo;
    ImageView imgrectangulo;
    Button btncalcularrectanculo;
    EditText edtancho,edtlargo;
    int total,ancho,largo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        txtrectangulo=findViewById(R.id.txtrectangulo);
        imgrectangulo=findViewById(R.id.imgrectangulo);
        btnmenú=findViewById(R.id.btnmenú);

        txtrsrectangulo=findViewById(R.id.txtrsrectangulo);
        edtancho=findViewById(R.id.edtancho);
        edtlargo=findViewById(R.id.edtlargo);
        btncalcularrectanculo=findViewById(R.id.btncalcularrectangulo);


        btncalcularrectanculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ancho=Integer.parseInt(edtancho.getText().toString());
                largo=Integer.parseInt(edtlargo.getText().toString());
                total=(ancho*largo);
                txtrsrectangulo.setText("el area del rectangulo es:  " + total);


            }
        });







        btnmenú=findViewById(R.id.btnmenú);
        btnmenú.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Rectangulo.this,InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.isabellaamst_l1_baquerizo_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static android.content.ClipData.newIntent;


public class MainActivity extends AppCompatActivity {
    private Button btn_academico,btn_bienestar,btn_vinculos, btn_sidweb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            btn_sidweb = (Button) findViewById(R.id.button);
            btn_academico = (Button) findViewById(R.id.button2);
            btn_bienestar = (Button) findViewById(R.id.button3);
            btn_vinculos = (Button) findViewById(R.id.button4);

            public void sidweb(View view) {
                Intent intent = new Intent(this, Sidweb.class);
                startActivity(intent);}

            public void academico (View view ) {
                Intent intent = new Intent(this, academico.class);
                startActivity(intent);
                /* btn_sidweb.setOnClickListener();*/}

            public void bienestar(View view ) {
                Intent intent = new Intent(this, Sidweb.class);
                startActivity(intent);}

            public void vinculos(View view ) {
                Intent intent = new Intent(this, Sidweb.class);
                startActivity(intent);}



        }
    }

               /* btn_sidweb.setOnClickListener();
                Intent intent = newIntent(.this, Main2Activity.class);
                startActivity(intent);*/





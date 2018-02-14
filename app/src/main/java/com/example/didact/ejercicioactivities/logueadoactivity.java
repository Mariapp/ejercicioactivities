package com.example.didact.ejercicioactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class logueadoactivity extends AppCompatActivity {


    TextView tvusuariologueado,tvcontrasenialogueada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueadoactivity);

        tvusuariologueado=(TextView)findViewById(R.id.tvusuariologueado);
        tvcontrasenialogueada=(TextView)findViewById(R.id.tvcontrasenialogueada);




        Bundle b=getIntent().getExtras();
        if(b!=null){

            String usuario=b.getString(loginactivity.EXTRA_USUARIO);
            String contrasenia=b.getString(loginactivity.EXTRA_CONTRASENIA);


            tvusuariologueado.setText(usuario);
            tvcontrasenialogueada.setText(contrasenia);







        }


    }

    public void botoniniciologueado (View v){
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);;



    }
}

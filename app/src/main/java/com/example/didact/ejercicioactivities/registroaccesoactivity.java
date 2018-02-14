package com.example.didact.ejercicioactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class registroaccesoactivity extends AppCompatActivity {

    TextView tvregistroaccesonombre,tvregistroaccesocontrasenia,tvregistroaccesoemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroaccesoactivity);


        tvregistroaccesoemail=(TextView)findViewById(R.id.tvregistroaccesoemail);
        tvregistroaccesonombre=(TextView)findViewById(R.id.tvregistroaccesonombre);
        tvregistroaccesocontrasenia=(TextView)findViewById(R.id.tvregistroaccesocontrasenia);

        Bundle b=getIntent().getExtras();
        if(b!=null){


            String usuario=b.getString(registroactivity.EXTRA_USUARIO);
            String contrasenia=b.getString(registroactivity.EXTRA_CONTRASENIA);

            tvregistroaccesonombre.setText(usuario);
            tvregistroaccesocontrasenia.setText(contrasenia);




            Toast.makeText(getApplicationContext(),
                    "Datos "+usuario+contrasenia,

                    Toast.LENGTH_LONG).show();
        }





    }

    public void botoninicioregistro (View view){
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);











    }



}

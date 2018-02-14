package com.example.didact.ejercicioactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {



    static final String EXTRA_USUARIO="Usuario";
    static final String EXTRA_CONTRASENIA="Contraseña";


    EditText edusuadio, edcontrasenia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);


        edusuadio=(EditText)findViewById(R.id.edusuario);
        edcontrasenia=(EditText)findViewById(R.id.edcontrasenia);

    }

    public void btaccederlogin (View view){

        //navegar a la siguiente activity y enviar datos

        String usuario=edusuadio.getText().toString();
        String contrasenia=edcontrasenia.getText().toString();


        if(usuario.equals("")||contrasenia.equals("")){
            Toast.makeText(getApplicationContext(),"Debes rellenar los campos",
                    Toast.LENGTH_LONG).show();

                }else{

            Intent i=new Intent(getApplicationContext(),
                    logueadoactivity.class);

            i.putExtra(EXTRA_USUARIO,usuario);
            i.putExtra(EXTRA_CONTRASENIA,contrasenia);


            startActivity(i);

        }






    }
}

package com.example.didact.ejercicioactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registroactivity extends AppCompatActivity {


    static final String EXTRA_USUARIO="Usuario";
    static final String EXTRA_CONTRASENIA="Contraseña";
    static final String EXTRA_EMAIL="Email";



    EditText etregistronombre,edregistroemail,edregistrocontrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroactivity);


        edregistrocontrasenia=(EditText)findViewById(R.id.edregistrocontrasenia);
                edregistroemail=(EditText)findViewById(R.id.edregistroemail);
                etregistronombre=(EditText)findViewById(R.id.etregistronombre);

    }




    public void botonregistroacceder (View view){

        String usuario=etregistronombre.getText().toString();
        String contrasenia=edregistrocontrasenia.getText().toString();
        String email=edregistroemail.getText().toString();

        if(usuario.equals("")||contrasenia.equals("")||email.equals("")){
            Toast.makeText(getApplicationContext(),"Debes rellenar los campos",
                    Toast.LENGTH_LONG).show();

                    }else{

        Intent i=new Intent(getApplicationContext(),registroaccesoactivity.class);

        i.putExtra(EXTRA_USUARIO, usuario);
        i.putExtra(EXTRA_CONTRASENIA,contrasenia );
        i.putExtra(EXTRA_EMAIL, email);

        startActivity(i);



    }

}}

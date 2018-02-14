package com.example.didact.ejercicioactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btregistro (View view){
        Intent i=new Intent(getApplicationContext(),registroactivity.class);
        startActivity(i);


    }





    public void btlogin (View view){
        Intent i=new Intent(getApplicationContext(),loginactivity.class);

        startActivity(i);



    }
}

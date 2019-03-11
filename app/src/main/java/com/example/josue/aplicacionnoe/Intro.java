package com.example.josue.aplicacionnoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Intro extends AppCompatActivity {
    private PrefManager prefManager;

    private View btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent=new Intent(Intro.this, MainActivity.class);
                    startActivity(intent);
                }
        });
    }
}

package com.amol.helloworld;

//import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button myButton = findViewById(R.id.button);
        final TextView Dkte = findViewById(R.id.dkte);
        Button Mybutton2 =findViewById(R.id.button2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dkte.setTextColor(Color.BLACK);

            }
        });

        Mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dkte.setTextColor(Color.RED);
            }
        });

    }
}
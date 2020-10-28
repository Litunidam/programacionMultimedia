package com.example.ejemplo1;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private TextView tv;
    private ConstraintLayout background;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn_hora);
        tv = findViewById(R.id.tv_hora);
        background = findViewById(R.id.cl_fondo);
        button2 = findViewById(R.id.btn_back);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jayce = "Mira ste jayce";
                tv.setText(jayce);
                background.setBackgroundResource(R.drawable.jayce);
                //background.setBackground(getDrawable(R.drawable.jayce)); deprecated


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String holis = "Holis";
                background.setBackgroundColor(0x0000FF00);
                tv.setText(holis);
            }
        });

    }
}
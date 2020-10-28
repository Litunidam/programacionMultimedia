package com.example.mayordetres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button maxButton;
    private TextView result;
    private EditText number1;
    private EditText number2;
    private EditText number3;

    private double one;
    private double two;
    private double three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);

        result = findViewById(R.id.tvResult);
        maxButton = findViewById(R.id.btnMax);


        maxButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {

                    one = Double.parseDouble(String.valueOf(number1.getText()));
                    two = Double.parseDouble(String.valueOf(number2.getText()));
                    three = Double.parseDouble(String.valueOf(number3.getText()));
                    if (one > two && one > three) {
                        result.setText("El mayor es: " + one);
                    } else if (two > one && two > three) {
                        result.setText("El mayor es: " + two);
                    } else if (three > one && three > two) {
                        result.setText("El mayor es: " + three);
                    }
                } catch (Exception e) {
                    result.setText("No has introducido bien los datos");
                }
            }


        });


    }
}
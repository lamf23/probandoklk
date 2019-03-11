package com.example.myapplication_pruebagit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Boton;
    EditText etNombre;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton = (Button)findViewById(R.id.button);
        etNombre = (EditText)findViewById(R.id.etNombre);
        textview = (TextView)findViewById(R.id.textView);

        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = etNombre.getText().toString();
                textview.setText("Hola  " +nombre);
            }
        });
    }
}

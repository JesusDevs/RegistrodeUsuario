package com.example.registrodeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.registrodeusuario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mbinding1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mbinding1 =ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(mbinding1.getRoot());

        //edición utilizando método Binding
        mbinding1.button.setText("Registrar");
        mbinding1.editTextTextEmailAddress.setText("correo@gmail.com");
        mbinding1.editTextTextPersonName2.setText("Jesús");
        mbinding1.editTextTextPersonName3.setText("Rodríguez");
        mbinding1.button.setText("Registrar");



    }
}
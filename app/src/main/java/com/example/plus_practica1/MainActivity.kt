package com.example.plus_practica1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btVerificar: Button;
    private lateinit var edPassword: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerificar = findViewById(R.id.btVerificar)
        btVerificar.setOnClickListener {}
        edPassword= findViewById(R.id.edPassword)
    }


}
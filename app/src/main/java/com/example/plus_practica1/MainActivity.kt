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
        btVerificar.setOnClickListener { enviarBienvenida() }
        edPassword= findViewById(R.id.edPassword)
    }

    fun enviarBienvenida(){
        val password = "123456$";
        if (edPassword.text.toString().equals(password)){
            val intent = Intent(this, BienvenidaActivity::class.java)
            startActivity(intent)

        }else{
            Toast.makeText(this, getString(R.string.msj_clave), Toast.LENGTH_LONG).show()

        }
    }
}
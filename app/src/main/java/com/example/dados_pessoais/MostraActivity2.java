package com.example.dados_pessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostraActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra2);

        Intent intent = getIntent();

        String Nome = intent.getStringExtra(MainActivity.EXTRA_NOME);
        String Telemovel = intent.getStringExtra(MainActivity.EXTRA_TELEMOVEL);
        String Email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String Idade = intent.getStringExtra(MainActivity.EXTRA_IDADE);
        String Peso = intent.getStringExtra(MainActivity.EXTRA_PESO);
        String Altura = intent.getStringExtra(MainActivity.EXTRA_ALTURA);

        TextView textViewNome = findViewById(R.id.textViewNome);
        TextView textViewTelemovel = findViewById(R.id.editTextTelemovel);
        TextView textViewEmail = findViewById(R.id.editTextEmail);
        TextView textViewIdade = findViewById(R.id.editTextIdade);
        TextView textViewPeso = findViewById(R.id.editTextPeso);
        TextView textViewAltura = findViewById(R.id.editTextAltura);

        textViewNome.setText(Nome);
        textViewTelemovel.setText(Telemovel);
        textViewEmail.setText(Email);
        textViewIdade.setText(Idade);
        textViewPeso.setText(Peso);
        textViewAltura.setText(Altura);

    }
}

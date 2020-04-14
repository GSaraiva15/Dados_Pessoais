package com.example.dados_pessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "com.example.Dados_Pessoais.Nome";
    public static final String EXTRA_TELEMOVEL = "com.example.Dados_Pessoais.Telemovel";
    public static final String EXTRA_EMAIL = "com.example.Dados_Pessoais.Email";
    public static final String EXTRA_IDADE = "com.example.Dados_Pessoais.Idade";
    public static final String EXTRA_PESO = "com.example.Dados_Pessoais.Peso";
    public static final String EXTRA_ALTURA = "com.example.Dados_Pessoais.Altura";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviaMensagem (View view) {

        Intent intent = new Intent(this, MostraActivity2.class);

        EditText editTextNome = (EditText)findViewById(R.id.editTextNome);
        EditText editTextTelemovel =(EditText)findViewById(R.id.editTextTelemovel);
        EditText editTextEmail =(EditText)findViewById(R.id.editTextEmail);
        EditText editTextIdade =(EditText)findViewById(R.id.editTextIdade);
        EditText editTextPeso=(EditText)findViewById(R.id.editTextPeso);
        EditText editTextAltura = (EditText)findViewById(R.id.editTextAltura);

        String Nome = editTextNome.getText().toString();
        String Telemovel = editTextTelemovel.getText().toString();
        String Email = editTextEmail.getText().toString();
        String strIdade = editTextIdade.getText().toString();
        String strPeso = editTextPeso.getText().toString();
        String strAltura = editTextAltura.getText().toString();


            //----Verificar se os dados estão corretos---
            if(Nome.length()<=0){
                editTextNome.setError("Preencha o nome");
                editTextNome.requestFocus();
                return;
            }

            if(Telemovel.length()<=0){
                editTextTelemovel.setError("Preencha o telefone");
                editTextTelemovel.requestFocus();
                return;
            }

            if(Email.length()<=0){
                editTextEmail.setError("Preencha o Email");
                editTextEmail.requestFocus();
                return;
            }

            int idade;
        try{
            idade = Integer.parseInt(strIdade);
        }catch(NumberFormatException e){
            editTextIdade.setError("Insira uma idade válida");
            editTextIdade.requestFocus();
            return;
            }
        if(idade <18) {
            editTextIdade.setError("A idade não pode ser inferior a 18 anos");
            editTextIdade.requestFocus();
            return;
        }

        float peso;
        try {
            peso = Float.parseFloat(strPeso);
        }catch(NumberFormatException e){
            editTextPeso.setError("Insira um Peso válido");
            editTextPeso.requestFocus();
            return;
        }
        float altura;
        try {
            altura = Float.parseFloat(strAltura);
        }catch(NumberFormatException e){
            editTextAltura.setError("Insira uma altura válida");
            editTextAltura.requestFocus();
            return;
        }


        intent.putExtra(EXTRA_NOME, Nome);
        intent.putExtra(EXTRA_TELEMOVEL, Telemovel);
        intent.putExtra(EXTRA_EMAIL, Email);
        intent.putExtra(EXTRA_IDADE, idade);
        intent.putExtra(EXTRA_PESO, peso);
        intent.putExtra(EXTRA_ALTURA, altura);

        startActivity(intent);



    }
}

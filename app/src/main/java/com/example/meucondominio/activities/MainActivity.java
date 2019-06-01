package com.example.meucondominio.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meucondominio.R;
import com.example.meucondominio.dbHelper.ConexaoSqLite;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastrarMoradores;
    private Button btnTelaLogin;
    private Button btnListarMoradores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chama a instancia de conexão ao banco (que verifica se a conexao é nula, antes de chamá-la
        ConexaoSqLite.getInstanciaConexao(this);

        btnCadastrarMoradores = (Button) findViewById(R.id.btnCadastrarMoradores);
        btnTelaLogin = (Button) findViewById(R.id.btnTelaLogin);
        btnListarMoradores = (Button) findViewById(R.id.btnListarMoradores);

        this.btnTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(intent);
            }
        });

        this.btnCadastrarMoradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityCadastrarMoradores.class);
                startActivity(intent);
            }
        });

        this.btnListarMoradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityListaMoradores.class);
                startActivity(intent);
            }
        });
    }
}

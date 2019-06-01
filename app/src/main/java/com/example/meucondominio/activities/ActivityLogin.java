package com.example.meucondominio.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.meucondominio.R;
import com.example.meucondominio.model.Morador;

public class ActivityLogin extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtSenha;
    private Button btnLogin;

    private Morador morador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    private Morador getLoginMorador() {
        this.morador = new Morador();

        if (this.txtUsuario.getText().toString().isEmpty() == false) {
            this.morador.setUsuario(this.txtUsuario.getText().toString());
        } else {
            return null;
        }

        if (this.txtSenha.getText().toString().isEmpty() == false) {
            this.morador.setSenha(this.txtSenha.getText().toString());
        } else {
            return null;
        }
        return this.morador;
    }
}

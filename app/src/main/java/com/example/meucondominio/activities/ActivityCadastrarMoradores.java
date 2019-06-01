package com.example.meucondominio.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.meucondominio.R;
import com.example.meucondominio.controller.MoradorController;
import com.example.meucondominio.dbHelper.ConexaoSqLite;
import com.example.meucondominio.model.Morador;

public class ActivityCadastrarMoradores extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtCpf;
    private EditText txtDataNascimento;
    private EditText txtTelefone;
    private EditText txtUsuario;
    private EditText txtSenha;
    private Button btnCadastrar;
    private Morador morador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_moradores);

        txtNome = (EditText) findViewById(R.id.txtNome);
        txtCpf = (EditText) findViewById(R.id.txtCpf);
        txtDataNascimento = (EditText) findViewById(R.id.txtDataNascimento);
        txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Morador moradorCadastrar = getCadastroMorador();
                if(moradorCadastrar != null){
                    MoradorController moradorController = new MoradorController(ConexaoSqLite.getInstanciaConexao(ActivityCadastrarMoradores.this));
                    long idMorador = moradorController.inserirMorador(moradorCadastrar);// retorna o id cadastrado

                    if(idMorador > 0){ //se tiver retornado um id, significa que cadastrou alguém
                        Toast.makeText( ActivityCadastrarMoradores.this, "Morador cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                        LimparCampos();
                        VoltarTelaInicial();
                    }
                    else {
                        Toast.makeText( ActivityCadastrarMoradores.this, "Erro ao cadastrar morador", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText( ActivityCadastrarMoradores.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void LimparCampos(){
        txtTelefone.setText("");
        txtNome.setText("");
        txtDataNascimento.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtCpf.setText("");
    }

    private void VoltarTelaInicial() {
        Intent intent = new Intent(ActivityCadastrarMoradores.this, MainActivity.class);
        startActivity(intent);
    }

    private Morador getCadastroMorador(){
        this.morador = new Morador();

        if (this.txtDataNascimento.getText().toString().isEmpty() == false) {
            this.morador.setUsuario(this.txtDataNascimento.getText().toString());
        } else {
            return null;
        }

        if (this.txtTelefone.getText().toString().isEmpty() == false) {
            this.morador.setSenha(this.txtTelefone.getText().toString());
        } else {
            return null;
        }

        if (this.txtNome.getText().toString().isEmpty() == false) {
            this.morador.setUsuario(this.txtNome.getText().toString());
        } else {
            return null;
        }

        if (this.txtCpf.getText().toString().isEmpty() == false) {
            this.morador.setSenha(this.txtCpf.getText().toString());
        } else {
            return null;
        }

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

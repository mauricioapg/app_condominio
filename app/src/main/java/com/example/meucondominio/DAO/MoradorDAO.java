package com.example.meucondominio.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.meucondominio.dbHelper.ConexaoSqLite;
import com.example.meucondominio.model.Morador;

import java.util.ArrayList;
import java.util.List;

public class MoradorDAO {

    private final ConexaoSqLite conexao;

    public MoradorDAO(ConexaoSqLite conexao) {
        this.conexao = conexao;
    }

    public long inserirMorador(Morador morador){

        SQLiteDatabase sql = conexao.getWritableDatabase(); //escreve dados no banco
        try {
            ContentValues values = new ContentValues();
            values.put("nome", morador.getNome());
            values.put("cpf", morador.getCpf());
            values.put("dataNascimento", morador.getDataNascimento());
            values.put("telefone", morador.getTelefone());
            values.put("usuario", morador.getUsuario());
            values.put("senha", morador.getSenha());
            values.put("idApartamento", morador.getIdApartamento());

            long moradorInserido = sql.insert("morador", null, values);

            return moradorInserido;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return 0; //se der algum erro na inserção, retorna zero;
    }

    public ArrayList<String> listarMoradores(Morador morador){
        ArrayList<String> listaExibir = new ArrayList<>();
        SQLiteDatabase sql = conexao.getReadableDatabase(); //Lê dados do banco
        try{

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return  listaExibir;
    }

}

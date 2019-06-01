package com.example.meucondominio.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoSqLite extends SQLiteOpenHelper {

    private static ConexaoSqLite INSTANCIA_CONEXAO;
    private static final int VERSAO_DB = 4;
    private static final String NOME_DB = "banco_condominio";

    //construtor da classe
    public ConexaoSqLite(Context context) {
        super(context, NOME_DB, null, VERSAO_DB);
    }

    //verifica se a conexão é nula, antes de instanciá-la
    public static ConexaoSqLite getInstanciaConexao(Context context){
        if(INSTANCIA_CONEXAO == null){
            INSTANCIA_CONEXAO = new ConexaoSqLite(context);
        }
        return INSTANCIA_CONEXAO;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se o banco não tiver sido criado, ele cria
        String sqlcriarTabelaMorador =
                "CREATE TABLE IF NOT EXISTS morador" +
                        "("+
                        "idMorador INTEGER PRIMARY KEY AUTOINCREMENT,"+
                        "nome VARCHAR,"+
                        "cpf VARCHAR,"+
                        "dataNascimento VARCHAR,"+
                        "telefone INTEGER,"+
                        "usuario VARCHAR,"+
                        "senha VARCHAR,"+
                        "idApartamento INTEGER"+
                        ")";

        //TESTE de VERIFICAÇÃO
        String listarMoradores =
                "SELECT nome FROM morador";

        db.execSQL(sqlcriarTabelaMorador);

        db.execSQL(listarMoradores);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

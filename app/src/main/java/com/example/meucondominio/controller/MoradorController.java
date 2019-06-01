package com.example.meucondominio.controller;

import com.example.meucondominio.DAO.MoradorDAO;
import com.example.meucondominio.dbHelper.ConexaoSqLite;
import com.example.meucondominio.model.Morador;

import java.util.ArrayList;

public class MoradorController {

    private final MoradorDAO moradorDAO;

    public MoradorController(ConexaoSqLite conexaoSqLite) {
        this.moradorDAO = new MoradorDAO(conexaoSqLite);
    }

    public long inserirMorador(Morador morador){
        return  this.moradorDAO.inserirMorador(morador);
    }

    public ArrayList<String> listarMoradores(Morador morador){
        return  this.moradorDAO.listarMoradores(morador);
    }
}

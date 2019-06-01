package com.example.meucondominio.model;

public class Bloco {
    private int idBloco;
    private String descricaoBloco;

    public Bloco(){
    }

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public String getDescricaoBloco() {
        return descricaoBloco;
    }

    public void setDescricaoBloco(String descricaoBloco) {
        this.descricaoBloco = descricaoBloco;
    }

    @Override
    public String toString() {
        return "Bloco{" +
                "idBloco=" + idBloco +
                ", descricaoBloco='" + descricaoBloco + '\'' +
                '}';
    }
}

package com.example.meucondominio.model;

public class Andar {
    private int idAndar;
    private int idBloco;
    private String descricaoAndar;

    public Andar(){
    }

    public int getIdAndar() {
        return idAndar;
    }

    public void setIdAndar(int idAndar) {
        this.idAndar = idAndar;
    }

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public String getDescricaoAndar() {
        return descricaoAndar;
    }

    public void setDescricaoAndar(String descricaoAndar) {
        this.descricaoAndar = descricaoAndar;
    }

    @Override
    public String toString() {
        return "Andar{" +
                "idAndar=" + idAndar +
                ", idBloco=" + idBloco +
                ", descricaoAndar='" + descricaoAndar + '\'' +
                '}';
    }
}

package com.example.meucondominio.model;

public class Apartamento {
    private int idApartamento;
    private double tamanho;
    private int nroApartamento;
    private int idCondominio;
    private int idAndar;

    public Apartamento(){
    }

    public int getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getNroApartamento() {
        return nroApartamento;
    }

    public void setNroApartamento(int nroApartamento) {
        this.nroApartamento = nroApartamento;
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public int getIdAndar() {
        return idAndar;
    }

    public void setIdAndar(int idAndar) {
        this.idAndar = idAndar;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "idApartamento=" + idApartamento +
                ", tamanho=" + tamanho +
                ", nroApartamento=" + nroApartamento +
                ", idCondominio=" + idCondominio +
                ", idAndar=" + idAndar +
                '}';
    }
}

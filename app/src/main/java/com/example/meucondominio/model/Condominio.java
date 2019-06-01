package com.example.meucondominio.model;


public class Condominio {
    private int idCondominio;
    private double taxaCondominio;

    public Condominio(){
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public double getTaxaCondominio() {
        return taxaCondominio;
    }

    public void setTaxaCondominio(double taxaCondominio) {
        this.taxaCondominio = taxaCondominio;
    }

    @Override
    public String toString() {
        return "Condominio{" +
                "idCondominio=" + idCondominio +
                ", taxaCondominio=" + taxaCondominio +
                '}';
    }
}

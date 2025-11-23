package com.jc;

import java.time.LocalDateTime;

public class Vente {
    String idVente;
    double amountVente;
    LocalDateTime dateVente;

    public Vente(String idVente, double amountVente, LocalDateTime dateVente) {
        this.idVente = idVente;
        this.amountVente = amountVente;
        this.dateVente = dateVente;
    }

    public String getIdVente() {
        return idVente;
    }

    public void setIdVente(String idVente) {
        this.idVente = idVente;
    }

    public double getAmountVente() {
        return amountVente;
    }

    public void setAmountVente(double amountVente) {
        this.amountVente = amountVente;
    }

    public LocalDateTime getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDateTime dateVente) {
        this.dateVente = dateVente;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "idVente='" + idVente + '\'' +
                ", amountVente=" + amountVente +
                ", dateVente=" + dateVente +
                '}';
    }
}

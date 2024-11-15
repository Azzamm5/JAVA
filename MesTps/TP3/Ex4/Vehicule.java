package MesTps.TP3.Ex4;

import java.time.LocalDate;

public abstract class Vehicule {
    protected String marque;
    protected LocalDate dateAchat;
    protected double prixAchat,prixCourant;


    public Vehicule(String m,LocalDate dateAchat,double prixAchat) {
        this.marque = m;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        prixCourant = CalculerPrixCoutant();

    }

    public abstract double CalculerPrixCoutant();
}

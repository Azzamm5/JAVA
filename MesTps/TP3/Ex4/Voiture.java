package MesTps.TP3.Ex4;

import java.time.LocalDate;
import java.time.Period;

public class Voiture extends Vehicule {
    private double cylinder,puissance;
    private Long nbrPortes,kilometrage;


    public Voiture(String marque, LocalDate dateAchat,double prixAchat,double cylinder,Long nbrPortes,Long kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylinder = cylinder;
        this.nbrPortes = nbrPortes;
        this.kilometrage = kilometrage;
    }

    @Override
    public double CalculerPrixCoutant() {
        double prixCourant = prixAchat;
        LocalDate dateActuelle = LocalDate.now();
        Period difference = Period.between(dateAchat, dateActuelle);


        for (int i = 0; i < difference.getYears(); i++) {
            prixCourant *= 0.98;
        }

        return prixCourant;
    }
}

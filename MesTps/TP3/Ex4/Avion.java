package MesTps.TP3.Ex4;

import java.time.LocalDate;

public class Avion extends Vehicule{
    private moteur MoteurAvion;
    private Long heuresVols;

    public Avion(String marque, LocalDate dateAchat, double prixAchat, moteur MoteurAvion, Long heuresVols) {
        super(marque, dateAchat, prixAchat);
        this.MoteurAvion = MoteurAvion;
        this.heuresVols = heuresVols;
    }

    @Override
    public double CalculerPrixCoutant() {
        return 0;
    }
}

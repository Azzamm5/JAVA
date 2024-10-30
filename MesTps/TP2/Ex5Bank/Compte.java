package MesTps.TP2.Ex5Bank;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compte {
    private static int compteurMatricule = 1;
    private String matricule;
    private double solde;
    private ArrayList<Log> operations;
    private Client proprietaire;
    private LocalDateTime dateDeCreation;

    public Compte(Client proprietaire,double solde) {
        this.matricule = generateMatricule();
        this.solde = solde;
        this.operations = new ArrayList<>();
        this.proprietaire = proprietaire;
        this.dateDeCreation = LocalDateTime.now();
    }

    // Méthode pour générer un matricule unique
    private String generateMatricule() {
        return "CIH-2024" + compteurMatricule++;
    }

    // Getters
    public String getMatricule() {
        return matricule;
    }

    public double getSolde() {
        return solde;
    }

    public ArrayList<Log> getOperations() {
        return operations;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public LocalDateTime getDateDeCreation() {
        return dateDeCreation;
    }

    // Setters
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setOperations(ArrayList<Log> operations) {
        this.operations = operations;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setDateDeCreation(LocalDateTime dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    // toString
    @Override
    public String toString() {
        return "Compte{" +
                "matricule='" + matricule + '\'' +
                ", solde=" + solde +
                ", operations=" + operations +
                ", proprietaire=" + proprietaire +
                ", dateDeCreation=" + dateDeCreation +
                '}';
    }
}

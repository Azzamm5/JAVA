package MesTps.TP2.Ex5Bank;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Compte {
    private static int compteurMatricule = 1980;
    private String matricule;
    private double solde;
    private ArrayList<Log> operations;
    private Client proprietaire;
    private LocalDateTime dateDeCreation;

    public Compte(Client proprietaire, double solde) {
        this.matricule = generateMatricule();
        this.solde = solde;
        this.operations = new ArrayList<>();
        this.proprietaire = proprietaire;
        this.dateDeCreation = LocalDateTime.now();
    }

    // Méthode pour générer un matricule unique
    private String generateMatricule() {
        return "CIH-2024-" + compteurMatricule++;
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

    // toString avec formatage de la date
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateFormattee = dateDeCreation.format(formatter);

        return "Compte{" +
                "matricule='" + matricule + '\'' +
                ", solde=" + solde +
                ", operations=" + operations +
                ", proprietaire=" + proprietaire +
                ", dateDeCreation=" + dateFormattee +
                '}';
    }
}
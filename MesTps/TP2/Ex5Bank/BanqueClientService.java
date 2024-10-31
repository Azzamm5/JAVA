package MesTps.TP2.Ex5Bank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BanqueClientService {

    private Client clientCourant;
    private Compte compteCourant;
    private final Banque banque;
    private final Scanner scanner = new Scanner(System.in);

    public BanqueClientService(Banque banque) {
        this.banque = banque;
    }

    public void selectionnerClient() {
        System.out.print("Entrer votre CIN : ");
        String cin = scanner.nextLine();

        for (Client client : banque.getClients()) {
            if (client.getCin().equals(cin)) {
                clientCourant = client;
                System.out.println("Client " + client.getNom() + " sélectionné avec succès.");
                return;
            }
        }
        System.out.println("Client introuvable.");
        clientCourant = null;
    }

    public void modifierInfosCompte() {
        if (clientCourant == null) {
            selectionnerClient();
            if (clientCourant == null) return; // Arrêter si le client n'a pas été trouvé
        }

        System.out.print("Entrer Votre Matricule : ");
        String mattri = scanner.nextLine();

        Compte compteToUpdate = findCompteByMatricule(mattri);
        if (compteToUpdate == null) {
            System.out.println("Matricule non valide.");
            return;
        }

        System.out.print("Nouveau Email : ");
        String email = scanner.nextLine();
        System.out.print("Nouveau Numéro de Téléphone : ");
        String tel = scanner.nextLine();

        clientCourant.setEmail(email);
        clientCourant.setTel(tel);
        System.out.println("Informations du compte modifiées avec succès.");
    }

    public void listerSesComptes() {
        if (clientCourant == null) {
            System.out.println("Aucun client sélectionné.");
            return;
        }

        System.out.println("Liste des comptes de " + clientCourant.getNom() + ":");
        for (Compte compte : clientCourant.getComptes()) {
            System.out.println(compte);
        }
    }

    public void fermerCompte(String matricule) {
        if (clientCourant == null) {
            System.out.println("Aucun client sélectionné.");
            return;
        }

        Compte compteToClose = findCompteByMatricule(matricule);
        if (compteToClose != null && compteToClose.getSolde() == 0) {
            clientCourant.getComptes().remove(compteToClose);
            System.out.println("Compte fermé avec succès.");
        } else {
            System.out.println("Compte introuvable ou solde non nul.");
        }
    }

    public void versement(double montant) {
        if (compteCourant == null) {
            System.out.println("Aucun compte sélectionné pour le versement.");
            return;
        }
        if (montant <= 0) {
            System.out.println("Le montant doit être supérieur à zéro.");
            return;
        }
        compteCourant.setSolde(compteCourant.getSolde() + montant);
        Log log = new Log(LocalDate.now(), LocalTime.now(), TypeLog.VERSSEMENT, "Versement de " + montant);
        compteCourant.getOperations().add(log);
        System.out.println("Versement de " + montant + " effectué avec succès.");
    }

    public void retrait(double montant) {
        if (compteCourant == null) {
            System.out.println("Aucun compte sélectionné pour le retrait.");
            return;
        }
        if (montant <= 0 || compteCourant.getSolde() < montant) {
            System.out.println("Montant invalide ou solde insuffisant.");
            return;
        }
        compteCourant.setSolde(compteCourant.getSolde() - montant);
        Log log = new Log(LocalDate.now(), LocalTime.now(), TypeLog.RETRAIT, "Retrait de " + montant);
        compteCourant.getOperations().add(log);
        System.out.println("Retrait de " + montant + " effectué avec succès.");
    }

    public void virement(double montant, String matriculeDest) {
        if (clientCourant == null) {
            System.out.println("Aucun client sélectionné.");
            return;
        }
        if (montant <= 0 || compteCourant == null || compteCourant.getSolde() < montant) {
            System.out.println("Montant invalide ou solde insuffisant.");
            return;
        }

        Compte compteDestinataire = findCompteByMatricule(matriculeDest);
        if (compteDestinataire == null || compteDestinataire == compteCourant) {
            System.out.println("Compte destinataire introuvable ou identique au compte source.");
            return;
        }

        compteCourant.setSolde(compteCourant.getSolde() - montant);
        compteDestinataire.setSolde(compteDestinataire.getSolde() + montant);

        Log logSource = new Log(LocalDate.now(), LocalTime.now(), TypeLog.VIREMENT, "Virement de " + montant + " vers " + matriculeDest);
        Log logDest = new Log(LocalDate.now(), LocalTime.now(), TypeLog.VIREMENT, "Virement reçu de " + montant + " de " + compteCourant.getMatricule());

        compteCourant.getOperations().add(logSource);
        compteDestinataire.getOperations().add(logDest);

        System.out.println("Virement de " + montant + " effectué avec succès vers " + matriculeDest);
    }

    public void historiqueOperations() {
        if (compteCourant == null) {
            System.out.println("Aucun compte sélectionné.");
            return;
        }
        System.out.println("Historique des opérations pour le compte " + compteCourant.getMatricule() + ":");
        for (Log log : compteCourant.getOperations()) {
            System.out.println(log);
        }
    }

    public void afficherSolde() {
        if (compteCourant == null) {
            System.out.println("Aucun compte sélectionné.");
            return;
        }
        System.out.println("Le solde du compte " + compteCourant.getMatricule() + " est de " + compteCourant.getSolde() + " unités.");
    }

    public void changerCompteCourant(String matricule) {
        Compte compte = findCompteByMatricule(matricule);
        if (compte != null) {
            compteCourant = compte;
            System.out.println("Compte courant changé avec succès au compte " + matricule);
        } else {
            System.out.println("Compte introuvable.");
        }
    }

    private Compte findCompteByMatricule(String matricule) {
        if (clientCourant == null) return null;
        for (Compte compte : clientCourant.getComptes()) {
            if (compte.getMatricule().equals(matricule)) {
                return compte;
            }
        }
        return null;
    }
}
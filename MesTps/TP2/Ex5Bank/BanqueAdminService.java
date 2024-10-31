package MesTps.TP2.Ex5Bank;

import java.security.SecureRandom;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BanqueAdminService {
    private Banque banque;

    public BanqueAdminService(Banque banque) {
        this.banque = banque;
    }

    // Méthode pour générer un mot de passe simple
    private String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    // Méthode utilitaire pour saisir une chaîne de caractères
    private String saisirString(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(message);
        return clavier.nextLine().trim();
    }

    public void creercompte() {
        System.out.println("===================================================");
        System.out.println("               Creation Du Compte                  ");
        System.out.println("===================================================");

        String nom = saisirString("| - Nom : ");
        String prenom = saisirString("| - Prenom : ");
        String adresse = saisirString("| - Adresse : ");
        String cin = saisirString("| - CIN : ");
        String telephone = saisirString("| - Telephone : ");
        String sex = saisirString("| - Sex : ");

        // Vérifier si le client existe déjà
        boolean clientExiste = banque.getClients().stream()
                .anyMatch(client -> client.getCin().equals(cin));

        if (clientExiste) {
            System.out.println("=======================================================");
            System.out.println("- Client déjà inscrit dans votre système BANKATI !!!!!!");
            System.out.println("=======================================================");
        } else {
            String password = generatePassword(8);  // 8 caractères pour le mot de passe

            Client client = new Client(nom, prenom, cin, adresse, telephone, sex, password);
            banque.getClients().add(client);
            Compte compte = new Compte(client, 0);
            client.getComptes().add(compte);

            System.out.println("=======================================================");
            System.out.println("- Client " + nom + " créé avec succès ");
            System.out.println("Mot de passe temporaire : " + password);
            System.out.println("=======================================================");
        }
    }

    public void listercompte() {
        System.out.println("===================================================");
        System.out.println("         LISTE DES CLIENTS | BANKATI              ");
        System.out.println("===================================================");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        for (Client client : banque.getClients()) {
            System.out.println("Client : " + client.getNom().toUpperCase() + " " + client.getPrenom() + " | ID : " + client.getId() + " |");
            System.out.println("CIN : " + client.getCin() + " | Email : " + client.getEmail() + " | Téléphone : " + client.getTel());

            if (client.getComptes() != null && !client.getComptes().isEmpty()) {
                System.out.println("---------------------------------------------------");
                for (Compte compte : client.getComptes()) {
                    String dateFormattee = compte.getDateDeCreation().format(formatter);
                    System.out.printf("\tMatricule : %-10s | Solde : %,.2f DH | Date de Création : %s%n",
                            compte.getMatricule(), compte.getSolde(), dateFormattee);
                }
                System.out.println("---------------------------------------------------");
            } else {
                System.out.println("---------------------------------------------------");
                System.out.println("\tAucun compte associé");
                System.out.println("---------------------------------------------------");
            }
            System.out.println();
        }

        System.out.println("===================================================");
    }
}

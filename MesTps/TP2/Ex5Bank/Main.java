package MesTps.TP2.Ex5Bank;

import java.util.Scanner;

public class Main {

    static void MenuPrincipal() {
        System.out.println("""
                |======================================================|
                |                   CIH BANQUE                         |
                |======================================================|
                | 1) - Administration                                  |
                | 2) - Clients                                         |
                | 3) - Quitter                                         |
                |======================================================|
                |- Entrer Votre Choix : 
                """);
    }

    static void MenuAdmin() {
        System.out.println("""
                |======================================================|
                |                   CIH BANQUE                         |
                |======================================================|
                |                                                      |
                | - Welcome to Espace Admin ---------------------------|
                |                                                      |
                |              -----   MENU    -----                   |
                | 1) - Créer Un Compte                                 |
                | 2) - Lister Tous Les Comptes                         |
                | 3) - Retour                                          |
                |======================================================|
                |- Entrer Votre Choix :
                """);
    }

    static void MenuClient() {
        System.out.println("""
                |======================================================|
                |                   CIH BANQUE                         |
                |======================================================|
                |                                                      |
                | - Welcome to Espace Client --------------------------|
                |                                                      |
                |              -----   MENU    -----                   |
                | 1) - Modifier les Informations du Compte             |
                | 2) - Effectuer un Versement                          |
                | 3) - Effectuer un Retrait                            |
                | 4) - Lister Tous Les Comptes                         |
                | 5) - Afficher Solde                                  |
                | 6) - Historique des Opérations                       |
                | 7) - Retour                                          |
                |======================================================|
                |- Entrer Votre Choix :
                """);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;

        // Creating bank, client, and service instances
        Banque banque = new Banque("CIH", "LOT EL HASSANIA", "398138921");
        Client client1 = new Client("Waassim", "Dahib", "AE123", "jdbsc@gmail.com", "123456", "M", "12345");
        banque.getClients().add(client1);

        BanqueAdminService adminService = new BanqueAdminService(banque);
        BanqueClientService clientService = new BanqueClientService(banque);

        // Main menu loop
        do {
            MenuPrincipal();
            choix = sc.nextInt();
            switch (choix) {
                case 1 -> {
                    MenuAdmin();
                    int choixAdmin = sc.nextInt();
                    switch (choixAdmin) {
                        case 1 -> adminService.creercompte();
                        case 2 -> adminService.listercompte();
                        case 3 -> System.out.println("Retour au menu principal...");
                        default -> System.out.println("Choix invalide.");
                    }
                }
                case 2 -> {
                    clientService.changerCompteCourant("12345");  // Example account matricule

                    MenuClient();
                    int choixClient = sc.nextInt();
                    switch (choixClient) {
                        case 1 -> clientService.modifierInfosCompte();
                        case 2 -> {
                            System.out.print("Montant du versement : ");
                            double montant = sc.nextDouble();
                            clientService.versement(montant);
                        }
                        case 3 -> {
                            System.out.print("Montant du retrait : ");
                            double montant = sc.nextDouble();
                            clientService.retrait(montant);
                        }
                        case 4 -> clientService.listerSesComptes();
                        case 5 -> clientService.afficherSolde();
                        case 6 -> clientService.historiqueOperations();
                        case 7 -> System.out.println("Retour au menu principal...");
                        default -> System.out.println("Choix invalide.");
                    }
                }
                case 3 -> {
                    System.out.println("Sortie en cours...");
                    System.exit(0);
                }
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 3);

        sc.close();
    }
}

package MesTps.TP2.Ex5Bank;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class BanqueAdminService {
    private Banque banque;


    public BanqueAdminService(Banque banque) {
        this.banque = banque;
    }

    public void creercompte() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("               Creation Du Compte                  ");
        System.out.println("===================================================");
        System.out.print("Nom : ");
        String nom = clavier.nextLine();
        System.out.print("Prenom : ");
        String prenom = clavier.nextLine();
        System.out.print("Adresse : ");
        String adresse = clavier.nextLine();
        System.out.print("CIN : ");
        String cin = clavier.nextLine();
        System.out.print("Telephone : ");
        String telephone = clavier.nextLine();
        System.out.print("Sex : ");
        String sex = clavier.nextLine();

        boolean clientExiste = false;
        for (Client cl : banque.getClients()) {
            if (cin.equals(cl.getCin())) {
                clientExiste = true;
                System.out.println("-------------------------------------------------------");
                System.out.println("- Client Deja inscrit dans votre Systeme BANKATI !!!!!!");
                System.out.println("-------------------------------------------------------");
                break;
            }
        }

        if (!clientExiste) {
            Client client = new Client(nom, prenom, adresse, cin, telephone, sex);
            banque.getClients().add(client);
            Compte c = new Compte(client, 0);
            client.getComptes().add(c);
            System.out.println("---------------------------------------------------");
            System.out.println("- Client " + nom + " Creer Avec Succes ");
            System.out.println("---------------------------------------------------");
        }
    }






    public void listercompte() {
        System.out.println("===================================================");
        System.out.println("         LISTE DES CLIENTS | BANKATI              ");
        System.out.println("===================================================");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        for (Client client : banque.getClients()) {
            System.out.println("Client : " + client.getNom().toUpperCase() + " " + client.getPrenom());
            System.out.println("CIN : " + client.getCin() + " | Email : " + client.getEmail() + " | Téléphone : " + client.getTel());

            if (client.getComptes() != null && client.getComptes().size() > 0) {
                System.out.println("---------------------------------------------------");
                for (Compte compte : client.getComptes()) {
                    // Formater la date de création
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

package MesTps.TP2.Ex5Bank;
import java.util.Scanner;
import java.util.ArrayList;

public class BanqueAdminService {
    private Banque banque;


    public BanqueAdminService(Banque banque) {
        this.banque = banque;
    }

    public void creercompte() {
        Scanner clavier = new Scanner(System.in);
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

        // Objet de type Client qui stock le nouveau Client Crrer Par l'admin
        Client client = new Client(nom,prenom,adresse,cin,telephone,sex);
        banque.getClients().add(client);
        Compte c = new Compte(client,0);
        client.getComptes().add(c);
    }

    public void listercompte() {
        System.out.println("________ Liste des Clients et Comptes BANKATI _________");

        for (Client client : banque.getClients()) {
            System.out.println("Client : " + client); // Affiche les informations du client

            // Liste les comptes associés au client
            for (Compte compte : client.getComptes()) {
                System.out.println("  - Compte : " + compte); // Affiche les informations du compte
            }
        }

        System.out.println("___________________________________________");
    }

}

package MesTps.TP2.Ex5Bank;
import java.util.Scanner;


public class BanqueClientService {

    public Client clientCourant;
    private Banque banque;
    private Compte compteCourant;

    Scanner scanner = new Scanner(System.in);

    public BanqueClientService(Banque banque) {
        this.banque = banque;
    }

    public void modifierinfosCompte() {
        System.out.print("Entrer Votre Matricule : ");
        String mattri = scanner.nextLine();
        System.out.print("Entrer Votre Cin : ");
        String cin = scanner.nextLine();

        for (Client c : banque.getClients()) {
            if (c.getCin().equals(cin)) {
                clientCourant = c;
            }
            else{
                System.out.println("Client Introuvable");
            }
        }


        // Parcourir les comptes du client courant
        for (Compte c : clientCourant.getComptes()) {
            if (c.getMatricule().equals(mattri)) {
                // Modifier les informations du client courant
                System.out.println("===================================================");
                System.out.print("| - New Email : ");
                String email = scanner.nextLine();
                System.out.println("===================================================");
                System.out.println("===================================================");
                System.out.print("| - New Numero de Telephone : ");
                String tel = scanner.nextLine();
                System.out.println("===================================================");
                clientCourant.setEmail(email);
                clientCourant.setTel(tel);
                System.out.println("|=========================================================");
                System.out.println("| Informations du compte modifiées avec succès. ✅✅✅✅✅");
                System.out.println("|==========================================================");

                return;
            }
        }

        System.out.println("Matricule non valide");
    }

    public void virement(){}
}

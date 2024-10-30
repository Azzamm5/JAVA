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
    static void MenuAdmin(){
        System.out.println("""
                |======================================================|
                |                   CIH BANQUE                         |
                |======================================================|
                |                                                      |
                | - Welcome to Espace Admin ---------------------------|
                |                                                      |
                |              -----   MENU    -----                   |
                | 1) - Creer Un Compte                                 |
                | 2) - Lister Tous Les Comptes                         |
                | 3) - Retour                                          |
                |======================================================|
                |- Entrer Votre Choix :
                """);
    }


    static void MenuClient(){
        System.out.println("""
                |======================================================|
                |                   CIH BANQUE                         |
                |======================================================|
                |                                                      |
                | - Welcome to Espace Client --------------------------|
                |                                                      |
                |              -----   MENU    -----                   |
                | 1) - Creer Un Compte                                 |
                | 2) - Lister Tous Les Comptes                         |
                | 3) - Retour                                          |
                |======================================================|
                |- Entrer Votre Choix :
                """);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;
        Banque banque = new Banque("CIH","LOT EL HASSANIA","398138921");
        BanqueAdminService bnqadmin = new BanqueAdminService(banque);
        do{
            MenuPrincipal();
            choix = sc.nextInt();
            switch (choix){
                case 1-> {
                    MenuAdmin();
                    int choixAdmin = sc.nextInt();
                    switch (choixAdmin){
                        case 1-> {
                            bnqadmin.creercompte();
                        }
                        case 2-> {
                            bnqadmin.listercompte();
                        }
                        case 3-> {}
                    }
                }
                case 2-> {
                    MenuClient();
                }
                case 3 -> {
                    System.out.println("Sortie .........");
                    System.exit(0);
                }
            }
        }while (choix != 3);

    }
}

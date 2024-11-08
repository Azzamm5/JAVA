package MesTps.TP3.Ex3;

public class Main {
    public static void main(String[] args) {

        // Création d'un Livre
        Livre livre = new Livre("Python For Hacker", "AZZAM|RIYAD", 1200L, 3L,2300.5);
        System.out.println("---- Livre ----");
        livre.afficherDetails();
        livre.emprunter();
        livre.retourner();




        // Création d'un Dictionnaire
        Dictionnaire dictionnaire = new Dictionnaire("Larousse", "Larousse Editions", "Français", "2024");
        System.out.println("\n---- Dictionnaire ----");
        dictionnaire.afficherDetails();
        dictionnaire.emprunter();
        dictionnaire.retourner();

        // Création d'un CD
        CD cd = new CD("JAVA FULL COURSE","BroCode", 20L,true,true);
        System.out.println("\n---- CD ----");
        cd.afficherDetails();
        cd.vendre();


        // Création d'un DVD
        DVD dvd = new DVD("Inception", "Christopher Nolan", 7200L, "HD");
        System.out.println("\n---- DVD ----");
        dvd.afficherDetails();

        System.out.println("\nTous les objets ont été testés avec succès !");
    }
}

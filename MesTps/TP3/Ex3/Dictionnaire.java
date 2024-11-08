package MesTps.TP3.Ex3;

public class Dictionnaire extends Document implements Empruntable{
    private String langue;
    private String edition;


    public Dictionnaire(String titre, String auteur, String langue, String edition) {
        super("Dictionnaire", titre, auteur);
        this.langue = langue;
        this.edition = edition;
    }

    @Override
    public void emprunter() {
        System.out.println("Le Dictionnaire a été emprunté.");
    }

    @Override
    public void retourner() {
        System.out.println("Le Dictionnaire a été retourné.");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Langue: " + langue + ", Edition: " + edition);
    }
}

package MesTps.TP3.Ex3;

public class DVD extends Multimedia{
    String qualite;


    public DVD(String titre, String auteur, Long duree,String qualite) {
        super(titre, auteur, duree);
        this.qualite = qualite;
    }

    @Override
    public void vendre() {
        System.out.println("Le DVD a été vendu.");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Qualité: " + qualite);
    }
}

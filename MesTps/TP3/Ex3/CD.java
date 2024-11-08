package MesTps.TP3.Ex3;

public class CD extends Multimedia{
    boolean gravable;
    boolean contientPDF;


    public CD(String titre, String auteur, Long duree, boolean gravisable, boolean contientPDF) {
        super(titre, auteur, duree);
        this.gravable = gravisable;
        this.contientPDF = contientPDF;
    }

    @Override
    public void vendre() {
        System.out.println("Le CD a été vendu.");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Gravable: " + (gravable ? "Oui" : "Non"));
    }

}

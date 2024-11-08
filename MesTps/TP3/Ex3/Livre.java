package MesTps.TP3.Ex3;

public class Livre extends Document implements Empruntable,Vendable{
    private Long nbrPages;
    private Long nbrVente;
    private Double prix;

    public Livre(String titre, String auteur, Long nbrPages, Long nbrVente, Double prix) {
        super("Livre", titre, auteur);
        this.nbrPages = nbrPages;
        this.nbrVente = nbrVente;
        this.prix = prix;
    }

    @Override
    public void emprunter() {
        System.out.println("Le livre a été emprunté.");
    }

    @Override
    public void retourner() {
        System.out.println("Le livre a été retourné.");
    }

    @Override
    public void vendre() {
        System.out.println("Le livre a été vendu.");
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de pages: " + nbrPages + ", Prix: " + prix);
    }
}

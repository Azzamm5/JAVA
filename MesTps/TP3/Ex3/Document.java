package MesTps.TP3.Ex3;

public abstract class Document {
    protected String type;
    protected String titre,auteur;


    public Document(String type, String titre, String auteur) {
        this.type = type;
        this.titre = titre;
        this.auteur = auteur;
    }

    public void afficherDetails() {
        System.out.println("Type: " + type + ", Titre: " + titre + ", Auteur: " + auteur);
    }

}

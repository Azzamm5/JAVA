package MesTps.TP2.Ex4;

public class Livre {
    private int id;
    private String titre, auteur;
    private double prix;


    // Getters
    public int getId(){return id;}
    public String getTitre(){return titre;}
    public String getAuteur(){return auteur;}
    public double getPrix(){return prix;}

    // Setters
     public void setId(int id){this.id = id;}
    public void setTitre(String titre){this.titre = titre;}
    public void setAuteur(String auteur){this.auteur = auteur;}
    public void setPrix(double prix){this.prix = prix;}





    //Constructeur Par default
    public Livre() {}

    // Constructeur Parametrer
    public Livre(int id, String titre, String auteur, double prix) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }


    // Constructeur avec un seul Parametre
    public Livre(String titre){
        this.titre = titre;
    }



    // Methode toString
    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                '}';
    }


}

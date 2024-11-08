package MesTps.TP3.Ex3;

public abstract class Multimedia extends Document implements Vendable {
    private Long duree;


    public Multimedia(String titre, String auteur, Long duree) {
        super("Multimédia", titre, auteur);
        this.duree = duree;
    }


    @Override
    public abstract void vendre();
}

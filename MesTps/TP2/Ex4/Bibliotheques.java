package MesTps.TP2.Ex4;
// Importer les package des ArrayList
import java.util.ArrayList;
import java.util.List;

public class Bibliotheques {
    private int id;
    ArrayList<Livre>livres;


    // Getters
    public int getId(){return id;}
    public List<Livre> getLivres(){return livres;}

    // Setters
    public void SetId(int id){this.id=id;}
    public void SetLivres(ArrayList<Livre> livres){this.livres=livres;}

    // Constructeur
    public Bibliotheques(){}

    // Methode toString


    @Override
    public String toString() {
        return "Bibliotheques{" +
                "id=" + id +
                ", livres=" + livres +
                '}';
    }
}

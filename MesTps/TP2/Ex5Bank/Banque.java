package MesTps.TP2.Ex5Bank;
import java.util.ArrayList;

public class Banque {
    private long id;
    private String nom;
    private String adresse;
    private String tel;
    private ArrayList<Client> clients;

    public Banque(String nom, String adresse, String tel) {
        this.id = 123;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
        this.clients = new ArrayList<>();
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    // toString
    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", clients=" + clients +
                '}';
    }
}

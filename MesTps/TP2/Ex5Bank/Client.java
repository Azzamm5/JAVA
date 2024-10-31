package MesTps.TP2.Ex5Bank;

import java.util.ArrayList;

public class Client {

    // Attributs
    private Long id;
    private String nom, prenom, cin, email, tel, sex,password;
    private ArrayList<Compte> comptes = new ArrayList<>();

    // Getters
    public Long getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getCin() { return cin; }
    public String getTel() { return tel; }
    public String getSex() { return sex; }
    public String getPassword() { return password; }
    public ArrayList<Compte> getComptes() { return comptes; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setEmail(String email) { this.email = email; }
    public void setCin(String cin) { this.cin = cin; }
    public void setTel(String tel) { this.tel = tel; }
    public void setSex(String sex) { this.sex = sex; }
    public void setPassword(String password) { this.password = password; }
    public void setComptes(ArrayList<Compte> comptes) { this.comptes = comptes; }

    // Constructeurs
    public Client() { this.comptes = new ArrayList<>();}

    public Client(String nom, String pre, String cn, String em,String pass) {
        this.nom = nom;
        this.prenom = pre;
        this.cin = cn;
        this.email = em;
        this.password = pass;
        this.comptes = new ArrayList<>();
    }

    public Client(String nom, String pre, String cn, String em, String t, String se,String pass) {
        this.nom = nom;
        this.prenom = pre;
        this.cin = cn;
        this.email = em;
        this.tel = t;
        this.sex = se;
        this.password = pass;
        this.comptes = new ArrayList<>();
    }

    // Methode toString
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                ", comptes=" + (comptes != null ? comptes.size() : 0) +
                '}';
    }
}
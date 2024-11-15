package MesTps.TP3.Ex4;

public class moteur {
    private String type;
    private double puissance;

    // Constructeur
    public moteur(String type, double puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    // Getters et setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "type='" + type + '\'' +
                ", puissance=" + puissance +
                '}';
    }
}

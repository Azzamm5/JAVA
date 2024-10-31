package MesTps.TP2.Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialisation des livres
        Livre livre1 = new Livre(1, "JAVA By AZZAM", "AZZAM MOHAMed", 20.5);
        Livre livre2 = new Livre(2, "LINUX For hacker", "Antoine de Saint-Exupéry", 15.0);
        Livre livre3 = new Livre(3, "1984", "George Orwell", 18.0);

        // Initialisation de la bibliothèque
        Bibliotheques bibliotheque = new Bibliotheques();
        bibliotheque.SetId(1);
        bibliotheque.SetLivres(new ArrayList<>());

        // Initialisation du service de gestion de bibliothèque
        ServiceLibrary service = new ServiceLibrary();

        // Ajout des livres
        service.ajouter(livre1, bibliotheque);
        service.ajouter(livre2, bibliotheque);

        // Tentative d'ajouter un livre existant
        service.ajouter(livre1, bibliotheque); // Devrait afficher "Livre Existant !!!!"

        // Afficher la bibliothèque après ajout
        System.out.println("Bibliothèque après ajout :");
        System.out.println(bibliotheque);

        // Modification du titre d'un livre
        System.out.println("Modification du titre de 'Les Misérables' :");
        service.modifier(livre1, bibliotheque);

        // Afficher la bibliothèque après modification
        System.out.println("Bibliothèque après modification :");
        System.out.println(bibliotheque);

        // Suppression d'un livre
        System.out.println("Suppression de 'Le Petit Prince' :");
        service.Supprimer(bibliotheque, livre2);

        // Afficher la bibliothèque après suppression
        System.out.println("Bibliothèque après suppression :");
        System.out.println(bibliotheque);
    }
}
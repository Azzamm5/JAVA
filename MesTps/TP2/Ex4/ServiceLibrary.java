package MesTps.TP2.Ex4;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLibrary {

    Scanner kayboard = new Scanner(System.in);
    public void ajouter(Livre l, Bibliotheques b){
        if(b.livres.contains(l.getId())){
            System.out.println("Livre Existant !!!!");
        }else{
            b.livres.add(l);
        }
    }


    public void modifier(Livre l, Bibliotheques b){
        if(b.livres.contains(l.getId())){
            System.out.println("Modification de : " + l.getTitre());
            l.setTitre(kayboard.nextLine());
        }else {
            System.out.println("Livre Introuvable  !!!!");
        }
    }



    public void Supprimer(Bibliotheques b,Livre l){
        if(b.livres.contains(l.getId())){
            b.livres.remove(l);
        }else{
            System.out.println("Livre Introuvable  !!!!");
        }
    }



}

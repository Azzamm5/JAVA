package TP1;
import java.util.Scanner;
import TP1.ex1.ArraysOperations;
public class TEST_TP1 {


    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Insert Element");

        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();


        if (choix == 1){
            ArraysOperations arraysOperations = new ArraysOperations();

        }else{
            System.out.println("Veuillez entrer un valeur");
        }
    }

}

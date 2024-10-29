package TP1.ex1;
/*
 * Copyright (c) [2024] [AZZAM Mohamed ]
 * Tous droits réservés.
 *
 * Description : [Classe contenant des opérations sur les tableaux.]
 *
 * Ce logiciel est un exemple de code Java et peut être utilisé pour des fins éducatives.
 */


import java.util.Scanner;
import java.util.Vector;

public class ArraysOperations {


/*=============================|
Creation du Tableau Version 1   ----------------------------------------------------------------------------------------
===============================|*/
    public static int[] CreateArray(Scanner keyboard,String name) {
        System.out.print("Enter La taille du Tableau : ");
        int n = keyboard.nextInt();
        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element "+ (i+1) + " : ");
            tab[i] = keyboard.nextInt();
        }
        return tab;
    }
//----------------------------------------------------------------------------------------------------------------------


/*=============================|
 Creation du Tableau Version 2  ----------------------------------------------------------------------------------------
===============================|*/
    public static int[] CreateArrayV2(Scanner keyboard,String name) {
        System.out.print("Entrer les elements du tableau separer par virgules (,)");
         String str = keyboard.nextLine();

        String[] array = str.split(",");
        int[] tab = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tab[i] = Integer.parseInt(array[i]);
        }
        System.out.print("[ ");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ] ");
        return tab;
    }
//----------------------------------------------------------------------------------------------------------------------



/*=============================|
     Impression Du Tableau     |----------------------------------------------------------------------------------------
===============================|*/
    public static void printArray(int[] array, String name){
        System.out.print(name + "[ ");
        for (int j : array) {
            System.out.print(j + " | ");
        }
        System.out.println(" ]");
    }
//----------------------------------------------------------------------------------------------------------------------


/*=============================|
    inversion Du Tableau       |----------------------------------------------------------------------------------------
===============================|*/
    public static void reverser(int[] array){
        int[] temp = new int[array.length];
        for (int i = 0;i < array.length; i++){
            temp[i] = array[array.length - i - 1];
        }
        for(int j : temp){
            System.out.print(j + " | ");
        }
    }
//----------------------------------------------------------------------------------------------------------------------



/*=============================|
    fusionner Deux Tableau     |----------------------------------------------------------------------------------------
===============================|*/
    public static void concatener(int[] array,int[] array2){
        int size = array.length + array2.length;
        int[] newTab = new int[size];

        for(int i = 0;i < array.length; i++){
            newTab[i] = array[i] ;
        }
        for(int i = 0;i < array2.length; i++){
            newTab[array.length + i] = array2[i] ;
        }

        for(int a : newTab){
            System.out.print(a + " | ");
        }
    }
//----------------------------------------------------------------------------------------------------------------------


/*=================================|
    Counter element du Tableau     |------------------------------------------------------------------------------------
===================================|*/
    public static int count(int[] array, int element){
        int count = 0;
        for (int j : array) {
            if (j == element) {
                count+=1;
            }
        }
        return count;
    }
//----------------------------------------------------------------------------------------------------------------------




/*===================================|
    Supprimer element du Tableau     |------------------------------------------------------------------------------------
=====================================|*/
    public static void delete(int[] array, int m){
        int c = count(array, m);
        int[] temp = new int[array.length - c];
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] != m) {
                temp[j] = array[i];
                j++;
            }
        }
        for(int a : temp){
            System.out.print(a + " ");
        }
    }
//----------------------------------------------------------------------------------------------------------------------



/*==================================|
    Calculer element du Tableau     |------------------------------------------------------------------------------------
====================================|*/
    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
//----------------------------------------------------------------------------------------------------------------------



/*==================================|
    changer element du Tableau     |------------------------------------------------------------------------------------
====================================|*/
    public static void set(int[] array, int i, int v){
        for (int j = 0 ; j < array.length; j++) {
            if (array[j] == i) {
                array[j] = v;
            }

        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
//----------------------------------------------------------------------------------------------------------------------





/*=========================================|
    Calculer element des deux  Tableau     |----------------------------------------------------------------------------
===========================================|*/
    public static int sum2array(int[] array,int[] array2){
        return sum(array) + sum(array2);
    }
//----------------------------------------------------------------------------------------------------------------------




/*====================|
    Scalar Product    |-------------------------------------------------------------------------------------------------
=======================|*/
    public static void ScalarProduct(int[] array,int[] array2){
        if (array.length != array2.length){
            System.out.println("Erreur : Les Tableau Doivent Avoir la meme Taille !!!");

        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i] * array2[i];
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print("(" + array[i] + " * " + array2[i] + ")");
            if (i < array.length - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + result);
    }
//----------------------------------------------------------------------------------------------------------------------







    public static void printMenu() {
        String menu = """
                    |----------------------------------------------------
                    |                   PROJET JAVA                      
                    |----------------------------------------------------
                    | | 1  |  Créer Un Tableau V1                          
                    | | 2  |  Créer Un Tableau V2                          
                    | | 3  |  Inversion du Tableau                           
                    | | 4  |  Afficher les Éléments du Tableau              
                    | | 5  |  Supprimer les Éléments du Tableau              
                    | | 6  |  Calculer les Éléments du Tableau               
                    | | 7  |  Compter les Éléments du Tableau                
                    | | 8  |  Modifier un Élément                            
                    | | 9  |  Concaténer les Tableaux                       
                    | | 10 |  Produit Scalaire                              
                    | | 0  |  Quitter                                       
                    |----------------------------------------------------
                   \s""";
        System.out.println(menu);
    }

    public static void main(String[] args) {
        int choix;
        int CompteurTab = 0;
        int[] t = new int[0];
        int[] t2 = new int[0];
        Scanner keyboard = new Scanner(System.in);
        String nameArray = "";
        String nameArray2 = "";
        Vector<String> ListArray = new Vector<>();
        do {
            printMenu();

            System.out.print("Enter Votre Choix : ");
            choix = keyboard.nextInt();
            keyboard.nextLine();
            switch (choix) {
                case 1:
                    System.out.print("Enter Nom Du Tableau : ");
                    nameArray = keyboard.nextLine();
                    t = CreateArray(keyboard,nameArray);
                    CompteurTab++;
                    ListArray.addElement( "| "+  CompteurTab+ " |- "+ nameArray);
                    System.out.println("Tableau " + CompteurTab + " cree.");
                    break;
                case 2:
                    System.out.print("Enter Nom Du Tableau : ");
                    nameArray2 = keyboard.nextLine();
                    t2 = CreateArrayV2(keyboard,nameArray2);
                    CompteurTab++;
                    ListArray.addElement( "| "+  CompteurTab+ " |- "+ nameArray2);
                    System.out.println("Tableau " + CompteurTab + " cree.");
                    break;
                case 3:
                    for(String a : ListArray){
                        System.out.println("- " + a + " | ");
                        System.out.println("_____________");
                    }
                    reverser(t);
                    break;case 4:
                    if (ListArray.isEmpty()) {
                        System.out.println("Aucun tableau n'a été créé.");
                        break;
                    }

                    System.out.println("Liste des tableaux créés :");
                    for (String a : ListArray) {
                        System.out.println("- " + a);
                    }

                    System.out.print("Entrer l'indice du tableau (1 ou 2) : ");
                    int indices = keyboard.nextInt();



                    if (indices == 1) {
                        printArray(t, nameArray);
                    } else if (indices == 2) {
                        printArray(t2, nameArray2);
                    } else {
                        System.out.println("Indice invalide. Veuillez entrer 1 ou 2.");
                    }
                    break;
                case 5:
                    System.out.print("Entrer l'element a supprimer ");
                    int m = keyboard.nextInt();
                    keyboard.nextLine();
                    delete(t, m);
                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("1 - La Somme d'un seul tableau ");
                    System.out.println("2 - La Somme des 2 tableau ");
                    System.out.println("---------------------");
                    System.out.print("Choix : ");
                    String choix2 = keyboard.nextLine();
                    if(choix2.equals("1")){
                        System.out.println("La somme des element du tableau : " + sum(t));
                    }else if(choix2.equals("2")){
                        System.out.println("La somme des elements du tableau : " + sum2array(t,t2));
                    }else{
                        System.out.println("Choix Invalid !!!!!");
                    }
                    break;
                case 7:
                    int element;
                    System.out.print("Entrer l'element a Conter : ");
                    element = keyboard.nextInt();
                    count(t, element);
                    break;
                case 8:
                    System.out.print("Entrer l'element a changer : ");
                    int i = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print("Entrer La Nouvelle Valeur : ");
                    int v = keyboard.nextInt();
                    keyboard.nextLine();
                    set(t, i,v);
                    break;
                case 9 :
                    concatener(t, t2);
                    break;
                case 10:
                    ScalarProduct(t, t2);
                    break;
                case 0:
                    System.out.println("Sortie...");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
            System.out.println();
        } while (choix != 0);

        keyboard.close();
    }

}




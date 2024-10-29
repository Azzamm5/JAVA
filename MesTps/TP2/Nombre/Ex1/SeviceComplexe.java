package MesTps.TP2.Nombre;

import java.util.Scanner;

public class SeviceComplexe {
    public static Complexe somme(Complexe c1, Complexe c2) {
        return
                new Complexe(
                        c1.getRe() + c1.getRe(),
                        c1.getIm() + c2.getIm()
                );
    }

    public static Complexe mines(Complexe c1, Complexe c2) {
        return
                new Complexe(
                        c1.getRe() - c2.getRe(),
                        c1.getIm() - c2.getIm()
                );
    }


    public static Complexe multiplication(Complexe c1, Complexe c2) {
        return
                new Complexe(
                        c1.getRe() * c2.getRe()- c1.getIm() * c2.getIm(),
                        c1.getRe() * c2.getIm() + c1.getIm() * c2.getRe()
                );
    }

    public static double  module(Complexe c) {
        return
//                Math.sqrt(Math.pow(c.getRe(), 2) + Math.pow(c.getIm(), 2));
                Math.hypot(c.getRe(), c.getIm());
    }


    public static Complexe inverse(Complexe c) {
        return
                new Complexe(
                        c.getRe() / Math.pow(module(c),2),
                        c.getIm() / Math.pow(module(c),2)
                );
    }


    public static Complexe division(Complexe c1, Complexe c2) {
        return
                multiplication(c1, inverse(c2));
    }


    public static Complexe conjuges(Complexe c) {
        return
                new Complexe(
                        c.getRe(),
                        -c.getIm()
                );
    }



    public static Complexe createComplexe(Scanner scanner) {
        System.out.print("Creation d'un Nombre Complexe : re + im * i  ");
    System.out.print("Entrer la Valeur de la partie reelle re : ");
    double re = scanner.nextDouble();
    System.out.print("Entrer la Valeur de la partie im : ");
    double im = scanner.nextDouble();
    return new Complexe(re, im);

    }
}

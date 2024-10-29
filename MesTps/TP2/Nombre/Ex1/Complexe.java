package MesTps.TP2.Nombre;

import java.util.Set;

public class Complexe {  // java bean
    private double re;
    private double im;

    // Getters
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    // Setters
    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }


    // Constructeur
    public Complexe() {
    }
    public Complexe(double im) {
        setIm(im);
    }
    public Complexe(double re, double im) {setRe(re);setIm(im);}
    public Complexe(Complexe other){setIm(other.im);setRe(other.re);}


    @Override
    public String toString() {
        if(re == 0 )return im +" *i";
        else
            if(im>0)return re +" + " + im +" *i";
            else return re +" - "+ Math.abs(im)+ " *i";
    }



    public static void main(String[] args) {

    }
}
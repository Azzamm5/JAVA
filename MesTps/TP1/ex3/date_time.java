package TP1.ex3;

public class date_time {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Bloc de code à mesurer
        for (int i = 0; i < 1000000; i++) {
            Math.pow(i, 2);
        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Temps d'exécution : " + duration + " millisecondes");
    }
}

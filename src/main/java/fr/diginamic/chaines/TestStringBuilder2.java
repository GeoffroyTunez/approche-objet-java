package fr.diginamic.chaines;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        String test ="";
        for (int i = 1; i <= 100000; i++) {
            test = test + i;
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

//        System.out.println("Longueur du texte généré : " + test);
    }
}

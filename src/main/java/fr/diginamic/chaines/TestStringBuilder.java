package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        StringBuilder test = new StringBuilder("");
        for (int i = 1; i <= 100000; i++) {
            test.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

//        System.out.println(test.toString());
    }
}

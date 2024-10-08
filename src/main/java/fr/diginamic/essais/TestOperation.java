package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperation {
    public static void main(String[] args) {
        double results;
        double a = 2;
        double b = 5;
        char operateur;
        operateur = '+';
        results = Operations.calcul(a,b,operateur);
        System.out.println(a + " " + operateur + " " + b + " = " + results);

        operateur = '-';
        results = Operations.calcul(a,b,operateur);
        System.out.println(a + " " + operateur + " " + b + " = " + results);

        operateur = '*';
        results = Operations.calcul(a,b,operateur);
        System.out.println(a + " " + operateur + " " + b + " = " + results);

        operateur = '/';
        results = Operations.calcul(a,b,operateur);
        System.out.println(a + " " + operateur + " " + b + " = " + results);
    }


}

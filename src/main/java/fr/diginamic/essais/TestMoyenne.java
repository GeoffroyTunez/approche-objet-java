package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne.ajout(2.5);
        System.out.println("ajout de : " + 2.5);
        CalculMoyenne.ajout(8.6);
        System.out.println("ajout de : " + 8.6);
        CalculMoyenne.ajout(14.5);
        System.out.println("ajout de : " + 14.5);
        CalculMoyenne.ajout(1.2);
        System.out.println("ajout de : " + 1.2);

        double moyenne = CalculMoyenne.calcul();
        System.out.println("Moyenne des ajout : " + moyenne);
    }
}

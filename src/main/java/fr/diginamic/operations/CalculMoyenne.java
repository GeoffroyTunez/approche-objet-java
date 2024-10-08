package fr.diginamic.operations;

public class CalculMoyenne {
    static double[] tab = new double[1];

    public static void ajout(double a) {

        double[] newTab = new double[tab.length + 1];

        for (int i = 0; i < tab.length; i++) {
            newTab[i] = tab[i];
        }

        newTab[tab.length] = a;
        tab = newTab;
    }

    public static double calcul(){
        double somme=0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        return somme/tab.length;
    }


}

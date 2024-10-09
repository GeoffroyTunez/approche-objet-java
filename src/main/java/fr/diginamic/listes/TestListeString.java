package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Nice");
        list.add("Carcassonne");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");

        // Trouver l'élément avec le plus de caractères
        String longString = "";
        for (String element : list) {
            if (element.length() > longString.length()) {
                longString = element;
            }
        }
        System.out.println("L'élément avec le plus de caractères est : " + longString);

        // Transformer tous les éléments en majuscules
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            list.set(i, element.toUpperCase());
        }
        System.out.println("passage 1");

        // Supprimer les éléments qui commencent par "N"
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).startsWith("N")) {
                list.remove(i);
            }
        }
        System.out.println("passage 2");

        // Afficher le contenu de la liste
        System.out.println("Contenu de la liste : ");
        for (String element : list) {
            System.out.println(element);
        }
    }
}

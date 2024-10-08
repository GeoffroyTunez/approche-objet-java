package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Jeanne d'Arc",250,248,2359.35);
        theatre1.inscrire(1,10.50);
        theatre1.inscrire(1,10.50);
        theatre1.inscrire(1,10.50);
        System.out.println("Recette total de " + theatre1.getNomTheatre() + " est de : " + theatre1.getRecetteTotal() + "€");
    }
}

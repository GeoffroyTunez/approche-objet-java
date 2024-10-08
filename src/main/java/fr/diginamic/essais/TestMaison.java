package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maMaison = new Maison();

        maMaison.ajouterPiece(new Salon(35,0));
        maMaison.ajouterPiece(new Cuisine(15,0));
        maMaison.ajouterPiece(new WC(2,0));

        maMaison.ajouterPiece(new Chambre(15,1));
        maMaison.ajouterPiece(new Chambre(15,1));
        maMaison.ajouterPiece(new Chambre(15,1));
        maMaison.ajouterPiece(new SalleDeBain(10,1));
        maMaison.ajouterPiece(null);

        System.out.println("Superficie total : " + maMaison.superficieTotal() + "²m");
        System.out.println("Superficie étage 0 : " + maMaison.superficieEtage(0) + "²m");
        System.out.println("Superficie étage 1 : " + maMaison.superficieEtage(1) + "²m");

        System.out.println("Superficie total des chambre : " + maMaison.superficieTypePiece(Chambre.class) + "²m");


    }
}

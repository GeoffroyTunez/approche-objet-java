package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(6,200);
        System.out.println("numéro du compte : " + compte1);
    }
}

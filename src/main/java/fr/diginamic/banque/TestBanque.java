package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte[] listCompte = {new Compte(1,200),new CompteTaux(2,500,2)};


        System.out.println("Compte : " + listCompte[0].toString());
        System.out.println("Compte : " + listCompte[1].toString());
    }
}

package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        int solde =0;
            Operation[] listOperation = {
                    new Debit(50,"05/11/2024"),
                    new Debit(300,"30/6/2020"),
                    new Debit(2,"22/12/2023"),
                    new Credit(100,"01/02/2023"
                )};

            for(int i=0;i<=(listOperation.length - 1);i++){
                System.out.println(listOperation[i].toString());
                if(listOperation[i] instanceof Debit){
                    solde = listOperation[i].getMontant() - solde;
                }else if(listOperation[i] instanceof Credit){
                    solde = listOperation[i].getMontant() + solde;
                }else{
                    System.out.println("Erreur lors du calcul !");
                }
            }
        System.out.println("Montant du solde après transaction : " + solde + "€");
    }
}

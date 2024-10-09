package fr.diginamic.sets;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> paysSet = new HashSet<>();

        // Ajout des pays avec leurs informations
        paysSet.add(new Pays("USA", 331000000, 67472));
        paysSet.add(new Pays("France", 65273511, 41463));
        paysSet.add(new Pays("Allemagne", 83783942, 46260));
        paysSet.add(new Pays("UK", 67886011, 41429));
        paysSet.add(new Pays("Italie", 60244639, 35603));
        paysSet.add(new Pays("Japon", 126476461, 40265));
        paysSet.add(new Pays("Chine", 1439323776, 10531));
        paysSet.add(new Pays("Russie", 145912025, 10880));
        paysSet.add(new Pays("Inde", 1380004385, 2170));

        Pays payBigPIB=null;
        double pib=0;
        for(Pays element : paysSet){
            if(payBigPIB == null || element.getPibHabitant() > payBigPIB.getPibHabitant()){
                payBigPIB = element;
                pib = payBigPIB.getPibHabitant();
            }
        }

        System.out.println("le pays avec le plus grand pib/habitant est : " + payBigPIB.getNom() + "avec un pib de : " + payBigPIB.getPibHabitant());

        payBigPIB=null;
        for(Pays element : paysSet){
            if(payBigPIB == null || (element.getPibHabitant()*element.getNbHabitants()) > (payBigPIB.getPibHabitant()* payBigPIB.getNbHabitants())){
                payBigPIB = element;
                pib = (payBigPIB.getPibHabitant() * payBigPIB.getNbHabitants());
            }
        }

        System.out.println("le pays avec le plus grand pib est : " + payBigPIB.getNom() + " avec un pib de : " + pib);


        Pays paysMinPIB=null;
        double minPibTotal = (payBigPIB.getPibHabitant() * payBigPIB.getNbHabitants());
        for (Pays element : paysSet) {
            double pibTotal = element.getPibHabitant() * element.getNbHabitants();
            if (pibTotal < minPibTotal) {
                minPibTotal = pibTotal;
                paysMinPIB = element;
            }
        }
        paysMinPIB.setNom((paysMinPIB.getNom()).toUpperCase());

        paysSet.remove(paysMinPIB);


        // Affichage des pays
        for (Pays pays : paysSet) {
            System.out.println(pays.toStringPib());
        }
    }
}

package fr.diginamic.sets;

import fr.diginamic.listes.Ville;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<Double>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(75.5);
        set.add(0.01);

        for(double element : set){
            System.out.println(element);
        }

        double doublePetit=0;
        for (Double element : set) {
            if (element < doublePetit) {
                doublePetit = element;
            }
        }
        set.remove(doublePetit);

        System.out.println("après modification : ");
        for(double element : set){
            System.out.println(element);
        }
    }
}

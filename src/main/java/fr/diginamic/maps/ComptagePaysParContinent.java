package fr.diginamic.maps;

import fr.diginamic.tri.Ville;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> paysArrayList = new ArrayList<>();

        paysArrayList.add(new Pays("France",65,"Europe"));
        paysArrayList.add(new Pays("Allemagne",80,"Europe"));
        paysArrayList.add(new Pays("Belgique",10,"Europe"));
        paysArrayList.add(new Pays("Russie",150,"Asie"));
        paysArrayList.add(new Pays("Chine",1400,"Asie"));
        paysArrayList.add(new Pays("Indonésie",220,"Océanie"));
        paysArrayList.add(new Pays("Australie",20,"Océanie"));

        HashMap<String, Integer> comptage = new HashMap<>();

        for(Pays pay : paysArrayList){
            String contient = pay.getContinent();
            if(comptage.containsKey(contient)){
                comptage.put(contient, comptage.get(contient)+1);

            }else{
                comptage.put(contient,1);
            }
        }

        System.out.println(comptage.size());
    }
}

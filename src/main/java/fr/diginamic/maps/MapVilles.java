package fr.diginamic.maps;

import fr.diginamic.tri.Ville;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {

    HashMap<String, Ville> villeMap = new HashMap<>();

    villeMap.put("Nice",new Ville("Nice", 343000));
    villeMap.put("Carcassonne",new Ville("Carcassonne", 47800));
    villeMap.put("Narbonne",new Ville("Narbonne", 53400));
    villeMap.put("Lyon",new Ville("Lyon", 484000));
    villeMap.put("Foix",new Ville("Foix", 9700));
    villeMap.put("Pau",new Ville("Pau", 77200));
    villeMap.put("Marseille",new Ville("Marseille", 850700));
    villeMap.put("Tarbes",new Ville("Tarbes", 40600));


    int petitVilleNb =0;
    String petitVilleNom ="";
    for(Ville ville : villeMap.values()){
        if(petitVilleNb == 0 || ville.getNbHabitants()<petitVilleNb){
            petitVilleNom = ville.getNom();
        }
    }

    villeMap.remove(petitVilleNom);

        for(Ville ville : villeMap.values()){
            System.out.println(ville.getNom());
        }

    }
}

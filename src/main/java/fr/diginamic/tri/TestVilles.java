package fr.diginamic.tri;

import fr.diginamic.tri.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> listVille = new ArrayList<>();

        listVille.add(new Ville("Nice", 343000));
        listVille.add(new Ville("Carcassonne", 47800));
        listVille.add(new Ville("Narbonne", 53400));
        listVille.add(new Ville("Lyon", 484000));
        listVille.add(new Ville("Foix", 9700));
        listVille.add(new Ville("Pau", 77200));
        listVille.add(new Ville("Marseille", 850700));
        listVille.add(new Ville("Tarbes", 40600));

        System.out.println("compare to : \n");


        Collections.sort(listVille);
        for (Ville ville : listVille) {
            System.out.println(ville.toString());
        }


        System.out.println("reste du code \n\n");


        String villePlusGrandePopulationNom = "";
        int villePlusGrandePopulationNb = 0;
        for (Ville ville : listVille) {
            if (ville.getNbHabitants() > villePlusGrandePopulationNb) {
                villePlusGrandePopulationNom = ville.getNom();
                villePlusGrandePopulationNb = ville.getNbHabitants();
            }
        }

        System.out.println("Nom de la ville avec le plus d'habitant : " + villePlusGrandePopulationNom);
        System.out.println("avec : " + villePlusGrandePopulationNb + " d'habitant");


        Ville villeMoinsHabitants = listVille.get(0);
        for (Ville ville : listVille) {
            if (ville.getNbHabitants() < villeMoinsHabitants.getNbHabitants()) {
                villeMoinsHabitants = ville;
            }
        }

        // Supprimer la ville avec le moins d'habitants
        listVille.remove(villeMoinsHabitants);

        for (int i = 0; i < listVille.size(); i++) {
            int nbHabitant = listVille.get(i).getNbHabitants();
            if (nbHabitant > 100000) {

                String nomEnMajuscules = listVille.get(i).getNom().toUpperCase();
                listVille.set(i, new Ville(nomEnMajuscules, nbHabitant));
            }
        }

        System.out.println("La liste final : ");
        for (Ville element : listVille) {
            System.out.println(element.toString());
        }
    }
}

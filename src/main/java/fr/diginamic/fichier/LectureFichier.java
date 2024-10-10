package fr.diginamic.fichier;

import java.io.*;
import java.util.ArrayList;

public class LectureFichier {
    public static void main(String[] args) {
        ArrayList<Ville> villelist = new ArrayList<>();
        String cheminFichier = "src/recensement.csv";
        String cheminNouveauFichier = "src/nouveauFichierRecensement.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier));
             BufferedWriter writer = new BufferedWriter(new FileWriter(cheminNouveauFichier))) {


            reader.readLine();
            String ligne;

            while ((ligne = reader.readLine()) != null) {
                String[] tokens = ligne.split(";");


                if (tokens.length > 7) {
                    String populationTotal = tokens[7].replaceAll(" ", "");
                    String nomCommune = tokens[6];
                    String codeDepartement = tokens[2];
                    String nomRegion = tokens[1];


                    villelist.add(new Ville(nomCommune, codeDepartement, nomRegion, Double.parseDouble(populationTotal)));
                }
            }


            for (Ville ville : villelist) {
                if (ville.getPopulationTotal() > 25000) {
                    String line = String.format(ville.getNom()+";"+ ville.getCodeDepartement()+";"+ ville.getNomRegion()+";"+ ville.getPopulationTotal());
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture ou de l'écriture du fichier : " + e.getMessage());
        }
    }
}

package fr.diginamic.fichier;

import java.io.*;

public class CreerFichier {
    public static void main(String[] args) {
        String cheminFichier = "src/recensement.csv";
        String cheminNouveauFichier = "src/nouveaufichier.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier));
             BufferedWriter writer = new BufferedWriter(new FileWriter(cheminNouveauFichier))) {

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 100) {
                System.out.println(line);

                writer.write(line);
                writer.newLine();
                count++;
            }

            System.out.println("Les 100 premières lignes ont été extraites dans " + cheminNouveauFichier);

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture ou de l'écriture du fichier : " + e.getMessage());
        }
    }
}

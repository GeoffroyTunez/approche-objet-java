package fr.diginamic.tri;

public class Ville implements Comparable<Ville> {
    String nom;
    int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + "| nombre d'habitant : " + nbHabitants;
    }

//    @Override
////    public int compareTo(Ville autreVille) {
////        // Comparaison des noms de ville par ordre alphabétique
////        return this.nom.compareTo(autreVille.getNom());
////    }

    @Override
    public int compareTo(Ville autreVille) {
        // Comparaison par nombre d'habitants
        return Integer.compare(this.nbHabitants, autreVille.getNbHabitants());
    }


}

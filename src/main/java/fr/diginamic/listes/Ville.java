package fr.diginamic.listes;

import java.security.PrivilegedAction;
import java.security.PublicKey;

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

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Ville)){
            return false;
        }
        Ville autre = (Ville)obj;

        return this.nom.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants();
    }

    @Override
    public int compareTo(Ville autre) {
        if(this.getNbHabitants() > autre.getNbHabitants()){
            return 1;
        }else if(this.getNbHabitants() < autre.getNbHabitants()){
            return -1;
        }
        return 0;
    }
}

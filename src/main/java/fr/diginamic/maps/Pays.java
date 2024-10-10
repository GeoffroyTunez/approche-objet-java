package fr.diginamic.maps;

public class Pays {
    String nom;
    int nbHabitant;
    String continent;

    public Pays(String nom, int nbHabitant, String continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}

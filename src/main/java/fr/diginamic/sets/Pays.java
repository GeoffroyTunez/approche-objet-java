package fr.diginamic.sets;

public class Pays {
    String nom;
    int nbHabitants;
    int pibHabitant;

    public Pays(String nom, int nbHabitants, int pibHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitant = pibHabitant;
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

    public int getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(int pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", pibHabitant=" + pibHabitant +
                '}';
    }
    public String toStringPib() {
        double pib = 0D;
        pib = pibHabitant * nbHabitants;
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", pibHabitant=" + pibHabitant +
                ", PIB =" + pib +
                '}';
    }
}
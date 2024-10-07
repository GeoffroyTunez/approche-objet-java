package fr.diginamic.banque.entites;

public class Compte {
    private int nbCompte;
    private int soldeCompte;

    public Compte(int nbCompte, int soldeCompte) {
        this.nbCompte = nbCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNbCompte() {
        return nbCompte;
    }

    public void setNbCompte(int nbCompte) {
        this.nbCompte = nbCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte n°" + nbCompte + ", soldeCompte=" + soldeCompte;
    }
}

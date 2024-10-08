package fr.diginamic.maison;

public class Piece {
    double superficie;
    int nbEtage;

    public Piece(double superficie, int nbEtage) {
        if(superficie > 0.1)
        this.superficie = superficie;
        this.nbEtage = nbEtage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNbEtage() {
        return nbEtage;
    }

    public void setNbEtage(int nbEtage) {
        this.nbEtage = nbEtage;
    }
}

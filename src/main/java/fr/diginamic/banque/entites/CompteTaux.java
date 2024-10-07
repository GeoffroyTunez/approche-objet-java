package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private int renumeration;


    public CompteTaux(int nbCompte, int soldeCompte, int remuneration) {
        super(nbCompte, soldeCompte);
    }

    @Override
    public String toString() {
        return  super.toString() + " Taux de renumeration du commpte : " + renumeration;
    }


}

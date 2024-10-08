package entites;

public class Theatre {
    String nomTheatre;
    int nbMaxPersonne;
    int totalInscrits;
    double recetteTotal;

    public Theatre(String nomTheatre, int nbMaxPersonne, int totalInscrits, double recetteTotal) {
        this.nomTheatre = nomTheatre;
        this.nbMaxPersonne = nbMaxPersonne;
        this.totalInscrits = totalInscrits;
        this.recetteTotal = recetteTotal;
    }


    public void inscrire(int nbIncrisption, double prixPlace){
       int totalTheorique = this.totalInscrits + nbIncrisption;
        if(this.nbMaxPersonne < totalTheorique){
            System.out.println("Erreur, maximum de personne atteinte !");
        }else{
            this.totalInscrits += nbIncrisption;
            this.recetteTotal += nbIncrisption * prixPlace;
            System.out.println("Ajout effectuer.");
        }

    }

    public String getNomTheatre() {
        return nomTheatre;
    }

    public void setNomTheatre(String nomTheatre) {
        this.nomTheatre = nomTheatre;
    }

    public int getNbMaxPersonne() {
        return nbMaxPersonne;
    }

    public void setNbMaxPersonne(int nbMaxPersonne) {
        this.nbMaxPersonne = nbMaxPersonne;
    }

    public int getTotalInscrits() {
        return totalInscrits;
    }

    public void setTotalInscrits(int totalInscrits) {
        this.totalInscrits = totalInscrits;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

    public void setRecetteTotal(double recetteTotal) {
        this.recetteTotal = recetteTotal;
    }
}

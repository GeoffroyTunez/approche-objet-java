package fr.diginamic.fichier;

public class Ville{
    String nom;
    String codeDepartement;
    String nomRegion;
    double populationTotal;


    public Ville(String nom, String codeDepartement, String nomRegion, double populationTotal) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotal = populationTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public double getPopulationTotal() {
        return populationTotal;
    }

    public void setPopulationTotal(double populationTotal) {
        this.populationTotal = populationTotal;
    }
}

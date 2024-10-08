package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public double GetSalaire() {
        return this.salaire;
    }

    @Override
    public void AfficherDonnees() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Salaire : " + this.salaire);
        System.out.println("Status : salarié");
    }

}

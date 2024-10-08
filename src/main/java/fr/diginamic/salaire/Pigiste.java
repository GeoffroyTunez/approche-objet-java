package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    int nbJourBosser;
    double salaireJournalier;

    public Pigiste(String nom, String prenom, int nbJourBosser, double salaireJournalier) {
        super(nom, prenom);
        this.nbJourBosser = nbJourBosser;
        this.salaireJournalier = salaireJournalier;
    }


    @Override
    public double GetSalaire() {
        return nbJourBosser*salaireJournalier;
    }

    @Override
    public void AfficherDonnees() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Salaire : " + (this.nbJourBosser * this.salaireJournalier));
        System.out.println("Status : pigiste");
    }
}

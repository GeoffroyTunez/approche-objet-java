package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale AdressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.AdressePostale = adressePostale;
    }

    public void getPersonne(){
        System.out.println("Nom : " + nom.toUpperCase() + " | Prenom : " + prenom.toUpperCase());
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setAdressePostale(AdressePostale adressePostale){
        this.AdressePostale = adressePostale;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public entites.AdressePostale getAdressePostale() {
        return AdressePostale;
    }
}

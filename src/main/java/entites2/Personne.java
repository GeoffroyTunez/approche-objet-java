package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale AdressePostale;

    public Personne(String nom, String prenom, entites.AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.AdressePostale = adressePostale;
    }

}

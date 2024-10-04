package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adressePersonne1 = new AdressePostale(12,"Leclerc",15500,"Nime");
        AdressePostale adressePersonne2 = new AdressePostale(4,"Ponpidou",9000,"Nantes");
        Personne personne1 = new Personne("Jacques","Dupont",adressePersonne1);
        Personne personne2 = new Personne("Marie","Degrand",adressePersonne2);

    }
}

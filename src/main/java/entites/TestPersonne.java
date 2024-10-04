package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Jacques";
        personne1.prenom = "Dupont";
        personne1.AdressePostale.numeroRue = 12;
        personne1.AdressePostale.libelleRue = "Leclerc";
        personne1.AdressePostale.codePostal = 15500;
        personne1.AdressePostale.Ville = "Nime";

        personne2.nom = "Marie";
        personne2.prenom = "Degrand";
        personne2.AdressePostale.numeroRue = 4;
        personne2.AdressePostale.libelleRue = "Ponpidou";
        personne2.AdressePostale.codePostal = 9000;
        personne2.AdressePostale.Ville = "Nantes";
    }
}

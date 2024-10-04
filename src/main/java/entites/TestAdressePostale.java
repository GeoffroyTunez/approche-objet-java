package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        AdressePostale adresse2 = new AdressePostale();

        adresse1.codePostal = 11000;
        adresse1.libelleRue = "Jean Pierre";
        adresse1.numeroRue = 12 ;
        adresse1.Ville = "Carcassonne";

        adresse2.codePostal = 14000;
        adresse2.libelleRue = "Jean Moulin";
        adresse2.numeroRue = 50;
        adresse2.Ville = "Toulouse";
    }
}

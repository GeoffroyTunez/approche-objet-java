package fr.diginamic.listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Paris",1000);
        Ville ville2 = new Ville("Paris",1000);

        if(ville1.equals(ville2)){
            System.out.println("Les villes sont les même");
        }else{
            System.out.println("Les villes ne sont pas égales !");
        }

        System.out.println("____\n");

        if(ville1 == ville2){
            System.out.println("Les villes sont les même");
        }else{
            System.out.println("Les villes ne sont pas égales");
        }
    }
}

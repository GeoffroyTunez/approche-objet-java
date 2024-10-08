package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCarac = chaine.charAt(0);
        System.out.println("Premier caractère : " + premierCarac);

        System.out.println("Longeur de 'chaine' : " + chaine.length());
        System.out.println("index du premier ';' : " + chaine.indexOf(';'));

        String nom = chaine.substring(0,chaine.indexOf(';'));
        System.out.println(nom.toUpperCase());
        System.out.println(nom.toLowerCase());

        String[] tabChaine = chaine.split(";");
        System.out.println("____");

        for(int i=0;i<tabChaine.length;i++){
            System.out.println(tabChaine[i]);
        }


        String prenom = tabChaine[1];

        double salaire = Double.parseDouble(tabChaine[2].replace(" ", ""));



        Salarie salarie1 = new Salarie(nom,prenom,salaire);

        System.out.println(salarie1.toString());



    }
}

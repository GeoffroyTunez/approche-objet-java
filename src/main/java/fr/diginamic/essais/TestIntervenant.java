package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Intervenant salarie1 = new Salarie("Jean","Michel",2500);

        Intervenant pigiste1 = new Pigiste("Marie","Dupont",5,70);

        System.out.println("salarie1 : "+salarie1.GetSalaire()+"€");
        System.out.println("pigiste1 : "+pigiste1.GetSalaire()+"€");

        salarie1.AfficherDonnees();
        pigiste1.AfficherDonnees();
    }
}

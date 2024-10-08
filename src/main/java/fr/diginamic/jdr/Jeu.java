package fr.diginamic.jdr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Jeu {
    Random random = new Random();
    private int nbJoueur = 0;  // Compteur de joueurs
    private List<Personnage> joueurs = new ArrayList<>();  // Liste dynamique de joueurs

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        System.out.println("Bonjour et bienvenue !\n");
        jeu.choix();  // Lancement du menu de choix
    }

    // Méthode pour créer un personnage
    private void createPersonnage() {

        // Création d'un nouveau personnage avec des caractéristiques aléatoires
        Personnage joueur = new Personnage(
                random.nextInt(12, 18),   // force
                random.nextInt(20, 50),   // points de vie
                0                         // score initial
        );

        joueurs.add(joueur);  // Ajout du personnage à la liste des joueurs
        nbJoueur++;  // Incrément du compteur de joueurs
        System.out.println("Personnage créé : " + joueur.toString());
    }

    // Méthode pour gérer les choix du joueur
    private void choix() {
        Scanner sc = new Scanner(System.in);
        while (true) {  // Boucle pour garder les options en place
            System.out.println("\nVeuillez choisir une option : ");
            System.out.println("1 - Créer un personnage");
            System.out.println("2 - Combattre une créature");
            System.out.println("3 - Afficher le score");
            System.out.println("4 - Terminer");

            try {
                String str = sc.nextLine();
                int choix = parseInt(str);

                if (choix == 1) {
                    createPersonnage();  // Création d'un personnage
                } else if (choix == 2) {
                    if (nbJoueur > 0 && joueurs.get(nbJoueur - 1).getPv() > 0) {
                        combattre();
                    } else {
                        System.out.println("Votre personnage est décédé. Il a obtenu un score de " + joueurs.get(nbJoueur - 1).getScore() + " points. Veuillez créer un nouveau personnage.");
                    }
                } else if (choix == 3) {
                    if (nbJoueur > 0) {
                        System.out.println("Score du joueur : " + joueurs.get(nbJoueur - 1).getScore());
                    } else {
                        System.out.println("Aucun joueur n'a été créé.");
                    }
                } else if (choix == 4) {
                    System.out.println("Merci d'avoir joué !");
                    break;  // Terminer le jeu
                } else {
                    System.out.println("Choix invalide, veuillez réessayer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
            }
        }
    }


    private void combattre() {
        System.out.println("Combat en cours...");
        int adversaire = random.nextInt(1,3);
//        1 - loup
//        2 - gobelin
//        3 - troll
        Personnage adversaireCreer = null;

        if(adversaire == 1){
            adversaireCreer = new Loup(
                    random.nextInt(3, 8),
                    random.nextInt(5, 10),
                    1
            );
            System.out.println("Vous tombez sur un loup ! ");
        }else if(adversaire == 2){
            adversaireCreer = new Gobelin(
                    random.nextInt(5, 10),
                    random.nextInt(10, 15),
                    2
            );
            System.out.println("Vous tombez sur un gobelin ! ");

        }else if(adversaire == 3){
            adversaireCreer = new Troll(
                    random.nextInt(10, 15),
                    random.nextInt(20, 30),
                    5
            );
            System.out.println("Vous tombez sur un troll ! ");

        }else{
            System.out.println("Erreur dans le choix de l'adversaire");
        }

        attaque(adversaireCreer);
        while(adversaireCreer.getPv() > 0 && joueurs.get(nbJoueur - 1).getPv() > 0){
            attaque(adversaireCreer);
        }
        if(adversaireCreer.getPv() <= 0){
            System.out.println("Combat terminé ! \n");

            joueurs.get(nbJoueur - 1).setScore( joueurs.get(nbJoueur - 1).getScore() + adversaireCreer.getScore());

            System.out.println("\n Vos avez gagner le combat, vous avez : "+joueurs.get(nbJoueur - 1).getScore());
            System.out.println("\n Il vous reste : "+joueurs.get(nbJoueur - 1).getPv() + "PV");

        }else if(joueurs.get(nbJoueur - 1).getPv() <= 0){
            System.out.println("Combat terminé ! \n");
            System.out.println("\nVous avez perdu le combat ! \n");
            System.out.println("\n Votre personnage a fais : " +joueurs.get(nbJoueur - 1).getScore());
        }



    }
    private void attaque(Personnage adversaireCreer){
        int attaqueJoueur = (joueurs.get(nbJoueur - 1).getForce() + random.nextInt(1, 10));
        int attaqueAdversaireCreer = adversaireCreer.getForce() + random.nextInt(1, 10);

        System.out.println("dégat de l'adversaire : " + attaqueAdversaireCreer);
        System.out.println("vos dégat : " + attaqueJoueur);

        if(attaqueJoueur > attaqueAdversaireCreer){

            int degat = attaqueJoueur-attaqueAdversaireCreer;
            adversaireCreer.setPv( adversaireCreer.getPv() - degat);
            System.out.println("Vous infliger une attaque");

        }else if(attaqueAdversaireCreer > attaqueJoueur){

            int degat = attaqueAdversaireCreer-attaqueJoueur;
            joueurs.get(nbJoueur - 1).setPv( joueurs.get(nbJoueur - 1).getPv() - degat);
            System.out.println("Vous recevez une attaque");

        }else{
            System.out.println("égalier des attque");
        }
    }
}

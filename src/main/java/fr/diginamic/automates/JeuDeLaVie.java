package fr.diginamic.automates;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class JeuDeLaVie {
    static Scanner scanner = new Scanner(System.in);


    static char[][] config1 = {
            {'|',' ','|',' ','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|','■','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|','■','|','■','|',' ','|'},
            {'|',' ','|',' ','|',' ','|','■','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|','■','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|','■','|',' ','|',' ','|',' ','|',' ','|','■','|',' ','|'}
    };




    static char[][] config2 = {
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|','■','|','■','|','■','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'}
    };



    static char[][] config3 = {
            {'|',' ','|',' ','|',' ','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|','■','|','■','|','■','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
            {'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'}
    };


    public static char[][] tabDeJeuNewGeneration = new char[5][21];

    public static void main(String[] args) {
        char[][] tabDeJeu = new char[5][21];


        System.out.println("Choisiser entre les 3 configuration possible : (1,2,3)");
        int choixUtil = scanner.nextInt();

        if(choixUtil == 1){
            tabDeJeu = config1;
        }else if(choixUtil == 2){
            tabDeJeu = config2;
        }else if(choixUtil == 3){
            tabDeJeu = config3;
        }else{
            System.out.println("ERREUR choix non valide ! ");
            return ;
        }

//        tabDeJeu = generationTab(tabDeJeu);
        printTab(tabDeJeu);

        System.out.println("tab.lenght" + tabDeJeu.length);
        System.out.println("tab[0].lenght" + tabDeJeu[0].length);

        System.out.println("Positionnement des cellules vivantes : ");

//        setTabCell(tabDeJeu);

        printTab(tabDeJeu);

        System.out.println("La parti commence ! ");

        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 1; j < tabDeJeu[i].length; j += 2) {

                System.out.println("test de sur la case i=" + i + "| j=" + j);

                checkCell(i, j, tabDeJeu);

            }
        }

        printTab(tabDeJeuNewGeneration);


    }


//    private static char[][] generationTab(char[][] tabDeJeu) {
//        for (int i = 0; i < tabDeJeu.length; i++) {
//            for (int j = 0; j < tabDeJeu[i].length; j++) {
//                if (j % 2 == 0) {
//                    tabDeJeu[i][j] = '|';
//                } else {
//                    tabDeJeu[i][j] = ' ';
//                }
//            }
//
//        }
//        return tabDeJeu;
//    }

    private static void printTab(char[][] tabDeJeu) {
        System.out.println("Affichage du tableau de jeu : ");

        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 0; j < tabDeJeu[i].length; j++) {
                System.out.print(tabDeJeu[i][j]);
            }
            System.out.println();
        }
    }

    private static void setTabCell(char[][] tabDeJeu) {
        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 0; j < tabDeJeu[i].length; j++) {
                if (j % 2 != 0) {
                    String entreChoixUtil = scanner.nextLine();
                    entreChoixUtil = entreChoixUtil.toUpperCase();
                    System.out.println("utilisateur input : " + entreChoixUtil.charAt(0));
                    char choixUtil = entreChoixUtil.charAt(0);
                    if (choixUtil == ' ' || choixUtil == '■') {
                        tabDeJeu[i][j] = choixUtil;
                    } else {
                        tabDeJeu[i][j] = ' ';
                    }
                }
            }
            System.out.println("fin de la ligne : " + i);

        }
    }

    private static void checkCell(int i, int j, char[][] tabDeJeu) {
        int nbCelleVivantProche = 0;
//            System.out.println("presence de cellule vivante en i="+i+"| j="+j);
        if (i == 0) {
            if (j == 1) {                               // coin haut gauche
                if (tabDeJeu[i][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + i + " | j=" + (j + 2));
                }
                if (tabDeJeu[i + 1][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i + 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + j);
                }
            } else if (j == (tabDeJeu[0].length - 2)) {          // coin haut droit
                if (tabDeJeu[i][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i + 1][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i + 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j));
                }
            } else {                                  // haut border
                if (tabDeJeu[i + 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j));
                }
                if (tabDeJeu[i + 1][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i + 1][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                }
            }
        }                            // en haut
        else if (i == (tabDeJeu.length - 2)) {
            if (j == 1) {                                   // coin bas gauche
                if (tabDeJeu[i - 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                }
                if (tabDeJeu[i - 1][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                }
            } else if (j == (tabDeJeu[0].length - 2)) {         // coin bas droit
                if (tabDeJeu[i][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i - 1][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i - 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                }
            } else {                                      // base border
                if (tabDeJeu[i][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i - 1][j - 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                }
                if (tabDeJeu[i - 1][j] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                }
                if (tabDeJeu[i - 1][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i - 1) + " | j=" + (j + 2));
                }
                if (tabDeJeu[i][j + 2] == '■') {
                    nbCelleVivantProche++;
                } else {
                    System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                }
            }

        }       // ou en bas
        else {
            if (j == 1) {
                if (i == (tabDeJeu.length - 1)) {
                    if (tabDeJeu[i - 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j + 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i][j + 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                    }
                } else {
                    if (tabDeJeu[i - 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j + 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i][j + 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i + 1][j + 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i + 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j));
                    }
                }

            } else if (j == (tabDeJeu[0].length - 2)) {
                if(i == (tabDeJeu.length -1)){
                    if (tabDeJeu[i - 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                    }
                }else{
                    if (tabDeJeu[i - 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i + 1][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i + 1][j] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j));
                    }
                }
            } else {
                if (i == (tabDeJeu.length - 1)) {
                    if (tabDeJeu[i][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i - 1][j - 2] == '■') { // check gauche haut
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i - 1][j] == '■') { // check haut
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j + 2] == '■') { // check haut droit
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i][j + 2] == '■') { // check droit
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                    }
                } else {

                    if (tabDeJeu[i][j - 2] == '■') { // check gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i - 1][j - 2] == '■') { // check gauche haut
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i - 1][j] == '■') { // check haut
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i - 1][j + 2] == '■') { // check haut droit
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i - 1) + " | j=" + (j - 2));
                    }
                    if (tabDeJeu[i][j + 2] == '■') { // check droit
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i + 1][j + 2] == '■') { // check bas droit
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j + 2));
                    }
                    if (tabDeJeu[i + 1][j] == '■') { // check bas
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j));
                    }
                    if (tabDeJeu[i + 1][j - 2] == '■') { // check bas gauche
                        nbCelleVivantProche++;
                    } else {
                        System.out.println("rien en : i=" + (i + 1) + " | j=" + (j - 2));
                    }
                }
            }
        }                                   // le reste

        if (nbCelleVivantProche == 2 || nbCelleVivantProche == 3) {
            tabDeJeuNewGeneration[i][j] = '■';
            System.out.println("ajout d'une cellule");
            System.out.println("nombre de celle proche = " + nbCelleVivantProche);
        } else if (nbCelleVivantProche >= 4 || nbCelleVivantProche < 2) {
            tabDeJeuNewGeneration[i][j] = ' ';
            System.out.println("mort d'une cellule");
            System.out.println("nombre de celle proche = " + nbCelleVivantProche);
        } else {
            System.out.println("ERREUR 100");
        }

    }
}

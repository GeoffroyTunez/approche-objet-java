package fr.diginamic.automates;

import java.util.Scanner;

public class JeuDeLaVie {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tabDeJeu = new char[5][21];


        tabDeJeu = generationTab(tabDeJeu);
        printTab(tabDeJeu);

        System.out.println("tab.lenght"+tabDeJeu.length);
        System.out.println("tab[0].lenght" + tabDeJeu[0].length);

        System.out.println("Positionnement des cellules vivantes : ");

        setTabCell(tabDeJeu);

        printTab(tabDeJeu);

        System.out.println("La parti commence ! ");




        System.out.println("calcul cellule proche :");
        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 1; j < tabDeJeu[i].length; j+=2) {
                if (i != 0 && i< (tabDeJeu.length-1)) {
                    if (j != 0 && j< (tabDeJeu[0].length-1)) {
                        int nbCellProcheVivante = findCellProcheVivante(i, j, tabDeJeu);
                        if (tabDeJeu[i][j] == 'X' && (nbCellProcheVivante >= 4 || nbCellProcheVivante < 2)) {
                            tabDeJeu[i][j] = ' ';
                            System.out.println("mort de la cellule 1000 en : i="+i +"|j="+j);
                            System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                        }
                    } else {
                        int nbCellProcheVivante = findCellProcheBorderVivant(i, j, tabDeJeu);
                        if (tabDeJeu[i][j] == 'X' && (nbCellProcheVivante >= 4 || nbCellProcheVivante < 2)) {
                            tabDeJeu[i][j] = ' ';
                            System.out.println("mort de la cellule 1001 en : i="+i +"|j="+j);
                            System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                        }
                    }
                }else {
                    int nbCellProcheVivante = findCellProcheBorderVivant(i, j, tabDeJeu);
                    if (tabDeJeu[i][j] == 'X' && (nbCellProcheVivante >= 4 || nbCellProcheVivante < 2)) {
                        tabDeJeu[i][j] = ' ';
                            System.out.println("mort de la cellule 1002 en : i="+i +"|j="+j);
                        System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                    }
                }

            }
        } // regle de mort
        System.out.println("fin de passage pour les vivant");

        for (int i = 0; i < tabDeJeu.length; i++) {   // regle de vie
            for (int j = 1; j < tabDeJeu[i].length; j+=2) {
                if (i != 0 && i< (tabDeJeu.length-1)) {
                    if (j != 0 && j<(tabDeJeu[0].length-1)) {
                        int nbCellProcheVivante = findCellProcheVivante(i, j, tabDeJeu);
                        if (tabDeJeu[i][j] == ' ' && nbCellProcheVivante==3) {
                            tabDeJeu[i][j] = 'X';
                            System.out.println("naissance d'une cellule 2000 en : i="+i +"|j="+j );
                            System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                        }
                    } else {
                        int nbCellProcheVivante = findCellProcheBorderVivant(i, j, tabDeJeu);
                        if (tabDeJeu[i][j] == ' ' && nbCellProcheVivante==3) {
                            tabDeJeu[i][j] = 'X';
                            System.out.println("naissance d'une cellule 2001 en : i="+i +"|j="+j);
                            System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                        }
                    }
                }
                else {
                    int nbCellProcheVivante = findCellProcheBorderVivant(i, j, tabDeJeu);
                    if (tabDeJeu[i][j] == ' ' && nbCellProcheVivante==3) {
                        tabDeJeu[i][j] = 'X';
                        System.out.println("naissance d'une cellule 2002 en : i="+i +"|j="+j);
                        System.out.println("nombre de cellule vivante : " + nbCellProcheVivante);
                    }
                }
            }
        }
        System.out.println("print du tab avec un tour de mort et de vie ");
        printTab(tabDeJeu);


    }


    private static char[][] generationTab(char[][] tabDeJeu) {
        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 0; j < tabDeJeu[i].length; j++) {
                if (j % 2 == 0) {
                    tabDeJeu[i][j] = '|';
                } else {
                    tabDeJeu[i][j] = ' ';
                }
            }

        }
        return tabDeJeu;
    }

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
                    if (choixUtil == ' ' || choixUtil == 'X') {
                        tabDeJeu[i][j] = choixUtil;
                    } else {
                        tabDeJeu[i][j] = ' ';
                    }
                }
            }
            System.out.println("fin de la ligne : " + i);

        }
    }

    private static int findCellProcheVivante(int i, int j, char[][] tabDeJeu) {
        int nbCellProcheVivante = 0;

        if (tabDeJeu[i - 1][j - 1] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i][j - 1] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i + 1][j - 1] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i - 1][j] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i + 1][j] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i - 1][j + 1] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i][j + 1] == 'X') {
            nbCellProcheVivante++;
        }
        if (tabDeJeu[i + 1][j + 1] == 'X') {
            nbCellProcheVivante++;
        }

        return nbCellProcheVivante;
    }

    private static int findCellProcheBorderVivant(int initI, int initJ, char[][] tabDeJeu) {
        int nbCellProcheVivante = 0;

        if (initI == 0) {
            if (initJ == 0) {                           // coins haut gauche
                if (tabDeJeu[initI][initJ +1] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI + 1][initJ] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI + 1][initJ + 1] == 'X') {
                    nbCellProcheVivante++;
                }
            }else if(initJ == (tabDeJeu[0].length-1)){         // coins haut droit
                if(tabDeJeu[initI][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI+1][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI+1][initJ] == 'X'){
                    nbCellProcheVivante++;
                }
            }else {                                      // bordure haute
                if (tabDeJeu[initI][initJ + 1] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI + 1][initJ] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI + 1][initJ + 1] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI + 1][initJ - 1] == 'X') {
                    nbCellProcheVivante++;
                } else if (tabDeJeu[initI][initJ - 1] == 'X') {
                    nbCellProcheVivante++;
                }
            }

        }                       // calcul haut
        else if(initI == (tabDeJeu.length-1)){
            if(initJ == 0){                             // coins bas gauche
                if(tabDeJeu[initI-1][initJ] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ+1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI][initJ+1] == 'X'){
                    nbCellProcheVivante++;
                }
            }else if (initJ == (tabDeJeu[0].length-1)) {       // coins bas droite
                if(tabDeJeu[initI][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ] == 'X'){
                    nbCellProcheVivante++;
                }
            }else{                                      //bordure basse
                if(tabDeJeu[initI][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ-1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI-1][initJ+1] == 'X'){
                    nbCellProcheVivante++;
                }else if(tabDeJeu[initI][initJ+1] == 'X'){
                    nbCellProcheVivante++;
                }
            }
        }   // calcul bas
        else if(initJ == 0){

            if(tabDeJeu[initI-1][initJ] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI-1][initJ+1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI][initJ+1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI+1][initJ+1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI+1][initJ] == 'X'){
                nbCellProcheVivante++;
            }
}                    // calcul gauche
        else if(initJ == (tabDeJeu.length-1)){
            if(tabDeJeu[initI+1][initJ] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI+1][initJ-1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI][initJ-1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI-1][initJ-1] == 'X'){
                nbCellProcheVivante++;
            }else if(tabDeJeu[initI-1][initJ] == 'X'){
                nbCellProcheVivante++;
            }
        }      // calcul droit


        return nbCellProcheVivante;
    }


}

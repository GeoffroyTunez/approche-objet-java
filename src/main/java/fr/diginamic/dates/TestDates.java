package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date dateDuJour = new Date();


        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + formatJourMoisAnnee.format(dateDuJour));

        Date dateSpecific = new Date(116, 4, 19, 23, 59, 30);

        SimpleDateFormat formatAnneeMoisJourHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + formatAnneeMoisJourHeure.format(dateSpecific));


        Date dateSysteme = new Date();
        System.out.println("Date/Heure système : " + formatAnneeMoisJourHeure.format(dateSysteme));
    }
}

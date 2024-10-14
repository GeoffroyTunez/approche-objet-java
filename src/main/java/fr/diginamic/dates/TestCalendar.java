package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar calendarSpecific = Calendar.getInstance();
        calendarSpecific.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateSpecific = calendarSpecific.getTime();


        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifique : " + formatJourMoisAnnee.format(dateSpecific));


        Calendar calendarToday = Calendar.getInstance();
        Date dateToday = calendarToday.getTime();


        SimpleDateFormat formatAnneeMoisJourHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du jour : " + formatAnneeMoisJourHeure.format(dateToday));

        SimpleDateFormat formateurFrance = new SimpleDateFormat("'Le' EEEE dd MMMM yyyy 'à' HH'h'", Locale.FRANCE);
        System.out.println(formateurFrance.format(dateToday));

        SimpleDateFormat formateurRusse = new SimpleDateFormat("'Le' EEEE dd MMMM yyyy 'à' HH'h'", new Locale("ru"));
        System.out.println(formateurRusse.format(dateToday));
        SimpleDateFormat formateurChinois = new SimpleDateFormat("'Le' EEEE dd MMMM yyyy 'à' HH'h'", Locale.CHINESE);
        System.out.println(formateurChinois.format(dateToday));
        SimpleDateFormat formateurAllemand = new SimpleDateFormat("'Le' EEEE dd MMMM yyyy 'à' HH'h'", Locale.GERMAN);
        System.out.println(formateurAllemand.format(dateToday));


    }

}

package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class FussionListe {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Rouge");
        list1.add("Vert");
        list1.add("Orange");

        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("Blanc");
        list1.add("Bleu");
        list1.add("Orange");

        ArrayList<String> list3 = new ArrayList<String>();
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            list3.add(element);
        }

        iterator = list2.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            list3.add(element);
        }

        System.out.println("Dans list 3 :");
        for (String element : list3) {
            System.out.println(element);
        }

    }
}

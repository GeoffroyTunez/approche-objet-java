package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        String grandString="";
        for(String element : set){
            if(grandString.length() < element.length()){
                grandString = element;
            }
        }

        System.out.println("La ville avec le plus grand nom est : " + grandString);

        set.remove(grandString);
        System.out.println("le set sans cet ville");
        for(String element : set){
            System.out.println(element);
        }
    }
}

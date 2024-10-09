package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);


        System.out.println("Dans list : ");
        for (int element : list) {
            System.out.println(element);
        }
        System.out.println("Taille de la list : " + list.size());

        int plusGrandInt =0;
        for (int element : list) {
            if(element>plusGrandInt){
                plusGrandInt = element;
            }
        }
        System.out.println("Le plus grand element : " + plusGrandInt);

        int plusPetitInt=0;
        for (int element : list) {
            if(element<plusPetitInt){
                plusPetitInt = element;
            }
        }
        System.out.println("Le plus petit element étais : " + plusPetitInt);

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element < 0) {
                list.set(i, element * -1);
            }
        }

        System.out.println("\nDans list final : ");
        for (int element : list) {
            System.out.println(element);
        }




    }
}

package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<101;i++){
            list.add(i);
        }

        System.out.println(list.size());
    }
}

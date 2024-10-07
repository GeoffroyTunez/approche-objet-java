package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";

        int chaineEnInt = Integer.parseInt(chaine);

        int a = 12;
        int b = 15;

        int maxInt = Integer.max(a,b);
        System.out.println("Entre a : "+a+" et b : "+b+" le max est : " + maxInt);
    }
}

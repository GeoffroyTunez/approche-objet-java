package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char operateur){
        double result;
        if(operateur == '+'){
            result = a + b;
        }else if(operateur == '-'){
            result = a - b;
        }else if(operateur == '*'){
            result = a * b;
        }else if(operateur == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Erreur : Division par zéro !");
                return result = 0000;
            }
        }
        else{
            return result=0000;
        }

        return result;
    }
}

package fr.diginamic.banque.entites;

public class Credit extends Operation{


    public Credit(  int montant,String dateOperation) {
        super( montant,dateOperation);
    }

    @Override
    public String toString() {
        return "CREDIT | Date de l'operation : " + getDateOperation() + "Montant : " + getMontant() +
                "\n__";
    }
}

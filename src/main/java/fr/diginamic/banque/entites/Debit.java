package fr.diginamic.banque.entites;

public class Debit extends Operation{

    public Debit(int montant, String dateOperation) {
        super(montant, dateOperation);
    }

    @Override
    public String toString() {
        return "DEBIT | Date de l'operation : " + getDateOperation() + "Montant : " + getMontant() +
                "\n__";
    }

}


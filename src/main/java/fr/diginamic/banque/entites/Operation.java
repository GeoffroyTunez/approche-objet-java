package fr.diginamic.banque.entites;

public abstract class Operation {
    private int montant;
    private String dateOperation;

    public Operation(int montant, String dateOperation) {
        this.montant = montant;
        this.dateOperation = dateOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Date de l'operation : " + dateOperation + "Montant : " + montant +
                "\n__";
    }
}

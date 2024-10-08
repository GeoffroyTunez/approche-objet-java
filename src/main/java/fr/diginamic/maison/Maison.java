package fr.diginamic.maison;

public class Maison {
    static Piece[] pieces;

    public Maison() {
        this.pieces = new Piece[0]; // Tableau vide au début
    }


    static public void ajouterPiece(Piece piece){
        if(piece != null){
            double superficieTotal = 0;
            Piece[] newPieces = new Piece[pieces.length + 1];
            for (int i = 0; i < pieces.length; i++) {
                newPieces[i] = pieces[i];
                superficieTotal += piece.superficie;

            }
            newPieces[pieces.length] = piece;
            pieces = newPieces;
            System.out.println("Ajout de la piece !");
        }else{
            System.out.println("Vous ne pouvez pas ajouter une pièce 'null'");
        }
    }

    static public double superficieTotal(){
        double superficieTotal=0;

        for (int i = 0; i < pieces.length; i++) {
            superficieTotal += pieces[i].superficie;

        }
        return superficieTotal;
    }
    static public double superficieEtage(int etage){
        double superficieTotal=0;

        for (int i = 0; i < pieces.length; i++) {
            if(pieces[i].nbEtage == etage){
                superficieTotal += pieces[i].superficie;
            }

        }
        return superficieTotal;
    }

    public double superficieTypePiece(Class<?> typePiece) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().equals(typePiece)) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

}

package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean move() {return true;}

    @Override
    public String toString() {
        if (this.getColor().isWhite())
            return "♖";
        else
            return "♜";
    }
}
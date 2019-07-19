package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class King extends Piece {

    public King(Color c) {
        super(c);
    }

    @Override
    public boolean move() {return true;}

    @Override
    public String toString() {
        if (this.getColor().isWhite())
            return "♔";
        else
            return "♚";
    }
}
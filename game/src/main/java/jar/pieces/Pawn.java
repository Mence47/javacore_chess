package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class Pawn extends Piece {

    public Pawn(Color c) {
        super(c);
    }

    @Override
    public boolean move(){return true;}
}
package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class Queen extends Piece {

    public Queen(Color c) {
        super(c);
    }

    @Override
    public boolean move() {return true;}
}
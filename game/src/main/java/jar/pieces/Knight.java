package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean move() {return true;}
}
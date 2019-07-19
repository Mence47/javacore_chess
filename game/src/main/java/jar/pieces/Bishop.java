package jar.pieces;

import jar.pieces.Piece;
import jar.Color;

public class Bishop extends Piece {
    
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean move() {return true;}
}
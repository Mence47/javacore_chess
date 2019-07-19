package jar.pieces;

import jar.Color;

public abstract class Piece {
    
    private Color color;

    abstract public boolean move();

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
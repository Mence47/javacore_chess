package jar;

import jar.Color;
import jar.pieces.*;

public class Field {

    final private int i;
    final private int j;
    final private Color color;
    private Piece piece = null;

    public Field(int i, int j, Color color, Piece piece) {
        this.i = i;
        this.j = j;
        this.color = color;
        this.piece = piece;
    }

    public Field(int i, int j, Color color) {
        this(i, j, color, null);
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public Color getColor() {
        return this.color;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        if (piece != null)
            return piece.toString();
        else if (color.isWhite())
            return "️◻️";
        else
            return "◼️";
    }
}
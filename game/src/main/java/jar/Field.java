package jar;

import jar.Color;
import jar.pieces.*;

public class Field {

    private int i;
    private int j;
    private Color color;
    private Piece piece = null;

    public Field() {
        
    }

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

    public void setI(int i) {
        this.i = i;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setJ(int j) {
        this.j = j;
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
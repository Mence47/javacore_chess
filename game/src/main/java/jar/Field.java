package jar;

import jar.Color;
import jar.pieces.*;

public class Field {

    private int i;
    private int j;
    private Color color;
    private Piece piece = null;

    public Field(int i, int j, Color color, Piece piece) {
        this.i = i;
        this.j = j;
        this.color = color;
        this.piece = piece;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
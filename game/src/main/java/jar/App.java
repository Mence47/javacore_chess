package jar;

import jar.Color;
import jar.pieces.*;

public class App {

    public static void main(String[] args) {
        Piece p = new Pawn(Color.BLACK);

        System.out.println(p.getColor().isWhite());
    }
}
 
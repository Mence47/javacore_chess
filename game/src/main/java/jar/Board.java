package jar;

import jar.Color;
import jar.Field;

public class Board {

    public Field[][] board;

    public Board() {
        this.board = new Field[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Field();
                board[i][j].setI(i);
                board[i][j].setJ(j);
                board[i][j].setColor(Color.BLACK);
            }
        }
    }
    public void init() {
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board[i].length; j++) {
        //         board[i][j] = new Field().setI(i);
        //         board[i][j].setJ(j);
        //         board[i][j].setColor(Color.WHITE);
        //     }
        // }
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][j].toString();
            }
            result += "\n";
        }
        return result;
    }
}
package jar;

import jar.Color;

public class Board {

    public Field[][] board;

    public Board() {
        this.board = new Field[8][8];
    }
    public void init() {
        // for (int i = 0; i < board.length) {
        //     for (int j = 0; j < board[i].length) {
        //         board[i][j].setI(i);
        //         board[i][j].setJ(j);
        //         board[i][j].setColor();
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
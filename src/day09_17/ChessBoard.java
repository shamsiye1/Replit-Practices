package day09_17;

import java.util.Arrays;

public class ChessBoard {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        for (int i=0; i<8; i++){

            for (char s='a'; s<='h'; s++){
              int j = s-97; // because 'a'==97 on aski table
                chessBoard[i][j]= i+1+""+s;

            }
        }

        System.out.println(Arrays.deepToString(chessBoard));





























































    }
}

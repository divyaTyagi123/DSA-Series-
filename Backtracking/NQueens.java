package Backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];

        System.out.println("Total no of solutions : " + nQueen(board ,0));

    }

    static int nQueen(boolean[][] board , int r){
        if(r == board.length){
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count= 0;

        for(int i = 0 ; i < board[r].length ; i++){
            if(isSafe(board , r , i)){
                board[r][i] = true;
                count = count + nQueen(board , r +1);
            }
            //revert changes if above function call returns

            board[r][i] = false;
        }

        return count;
    }


    static boolean isSafe(boolean[][] board , int r , int c){
        // for row
        for(int i = 0 ; i < r; i++){
            if(board[i][c]){
                return false;
            }
        }

        // for left diagonal
        int maxLeft = Math.min(r,c);
        for(int i = 1 ; i<= maxLeft ; i++){
            if(board[r-i][c-i]){
                return false;
            }
        }

        // for right diagonal

        int maxRight = Math.min(r,board.length - c -1);
        for(int i = 1 ; i<= maxRight ; i++){
            if(board[r-i][c+i]){
                return false;
            }
        }

        return true ;
    }

    static void displayBoard(boolean[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j]){
                    System.out.print("  Q   ");
                }
                else{
                    System.out.print("  X   ");
                }
            }
            System.out.println();
        }
    }

}

package Backtracking;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4] ;
        nKnights(board , 0 , 0, 4);
    }

    static void nKnights(boolean board[][] , int row , int col , int n){

        if(n == 0 ){
            displayBoard(board);
            System.out.println("\n");
            return ;
        }


        if(row == board.length-1 && col == board.length){
            return ;
        }

        if(col == board.length){
            nKnights(board , row + 1 , 0 , n);
            return ;
        }

        if(isSafe(board , row , col)){
            board[row][col] = true;
            nKnights(board , row  , col +1 , n-1);

            board[row][col] = false;
        }

        nKnights(board , row , col + 1 , n);

        return ;
    }

    static boolean isSafe(boolean[][] board , int r , int c){
        if( r > 1 && c < (board.length -1) && board[r-2][c+1]){
            return false;
        }
        if(r > 1 && c > 0 && board[r-2][c-1]){
            return false;
        }
        if(r > 0 && c < board.length - 2 && board[r-1][c+2]){
            return false;
        }
        if(r > 0 && c > 1 &&board[r-1][c-2]){
            return false;
        }

        return true ;
    }

    static void displayBoard(boolean[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j]){
                    System.out.print("  K   ");
                }
                else{
                    System.out.print("  -   ");
                }
            }
            System.out.println();
        }
    }

}

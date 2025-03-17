package Backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0},
                {6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 , 0},
                {0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0},
                {8 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 3},
                {4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1},
                {7 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 6},
                {0 , 6 , 0 , 0 , 0 , 0 , 2 , 8 , 0},
                {0 , 0 , 0 , 4 , 1 , 9 , 0 , 0 , 5},
                {0 , 0 , 0 , 0 , 8 , 0 , 0 , 7 , 9}
        };

        char[][] board2 = {
                {'5' , '3' , '-' , '-' , '7' , '-' , '-' , '-' , '-'},
                {'6' , '-' , '-' , '1' , '9' , '5' , '-' , '-' , '-'},
                {'-' , '9' , '8' , '-' , '-' , '-' , '-' , '6' , '-'},
                {'8' , '-' , '-' , '-' , '6' , '-' , '-' , '-' , '3'},
                {'4' , '-' , '-' , '8' , '-' , '3' , '-' , '-' , '1'},
                {'7' , '-' , '-' , '-' , '2' , '-' , '-' , '-' , '6'},
                {'-' , '6' , '-' , '-' , '-' , '-' , '2' , '8' , '-'},
                {'-' , '-' , '-' , '4' , '1' , '9' , '-' , '-' , '5'},
                {'-' , '-' , '-' , '-' , '8' , '-' , '-' , '7' , '9'}
        };

        sudoku(board , 0 , 0);

        System.out.println();

        charSudoku(board2);

//        if(sudoku2(board)){
//            display(board);
//        }
//        else{
//            System.out.println("Cannot be solved");
//        }
    }

    static boolean sudoku2(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1 ;

        boolean emptyLeft = true ;

        // finding empty cells
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false ;
                    break ;
                }
            }

            if(emptyLeft == false){
                break;
            }
        }

        // if no empty cell left means sudoku solved
        if(emptyLeft == true){
            return true;
        }

        // backtrack
        for(int i = 1 ; i <= 9 ; i++){
            if(isSafe(board,row , col , i)){
                board[row][col] = i;
                if(sudoku2(board)){
                    // found answer
                    return true ;
                }else{
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static void sudoku(int[][] board , int r , int c){
        if(r == board.length ){
            display(board);
            return ;
        }
        if(c == board.length){
            sudoku(board , r + 1 , 0);
            return;
        }
        if(board[r][c] == 0){
            for(int i = 1 ; i <= 9 ; i++){
                if(isSafe(board , r , c ,i)){
                    board[r][c] = i;
                    sudoku(board , r , c+1);   // if next function returns back here and place next safe value to the cell
                    board[r][c] = 0;
                }
            }
        }
        else{
            sudoku(board , r , c + 1);
            return;
        }
    }

    static boolean isSafe(int[][] board , int r , int c ,int i ){
     // horizontal check and vertical check


        for(int j = 0 ; j < board.length ; j++){
            if(board[r][j] == i){
                return false ;
            }
            if(board[j][c] == i){
                return false;
            }
        }

        // box check

        for(int k = (r - r % 3) ; k < (r - r % 3 )+3 ; k++){
            for(int j = (c - c % 3) ; j < (c - c % 3) + 3; j++){
                if(board[k][j] == i){
                    return false;
                }
            }
        }

        return true;

    }

    static void display(int[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
    }

    //=================================================================================================================


    static void charSudoku(char[][] board){
        int n = board.length;
        int row = -1 ;
        int col = -1;

        boolean emptyCell = false;

        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == '-'){
                    row = i ;
                    col = j;
                    emptyCell = true;
                    break;
                }
            }
            if(emptyCell){
                break;
            }
        }

        //if after the above loop emptyCell is still false it means no empty cell is remain so print ans and return
        if(emptyCell == false){
            display2(board);
            return;
        }

        // now we have an empty cell board[row][col] so we have to fill cell

        for(char ch = '1' ; ch <= '9' ; ch++){
            if(isSafe2(board , row , col , ch)){
                board[row][col] = ch;
                charSudoku(board);
                board[row][col] = '-';
            }
        }
        if(board[row][col] == '-')
            return;
    }

    static boolean isSafe2(char[][] board , int r , int c ,char i ){
        // horizontal check and vertical check


        for(int j = 0 ; j < board.length ; j++){
            if(board[r][j] == i){
                return false ;
            }
            if(board[j][c] == i){
                return false;
            }
        }

        // box check

        for(int k = (r - r % 3) ; k < (r - r % 3 )+3 ; k++){
            for(int j = (c - c % 3) ; j < (c - c % 3) + 3; j++){
                if(board[k][j] == i){
                    return false;
                }
            }
        }

        return true;

    }

    static void display2(char[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
    }


}

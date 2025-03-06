package Backtracking;


import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true , true , true},
                {true , true , true},
                {true , true , true},
        };



        int[][] board = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        printMatrix(""  ,board , 0 ,0 ,0);
    }

    static void printMatrix(String path , int[][] maze , int r , int c , int n){
        if(r == maze.length -1 && c == maze[0].length -1){
            maze[r][c] = n+1;
            for(int[] i : maze){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(path);
            return;
        }

        if(maze[r][c] != 0){
            return ;
        }

        // i am considering this block in my path , mark the cell which is visited
        maze[r][c] = n + 1;


        if(r < maze.length -1){
            printMatrix(path + "D" , maze , r+1 , c ,n+1);
        }

        if(c < maze[0].length -1){
            printMatrix(path + "R" , maze , r , c+1 ,n +1);
        }

        if(r > 0){
            printMatrix(path + "U" , maze , r-1 , c , n+1);
        }
        if(c > 0){
            printMatrix(path + "L" , maze , r , c-1 , n+1);
        }

        // function will be over here
        // so before the function gets removed , also remove the changes that were made by this recursion call
        maze[r][c] = 0;

    }

    static void allPaths(String path , boolean[][] maze , int r , int c){
        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(path);
            return;
        }

        if(!maze[r][c]){
            return ;
        }

        // i am considering this block in my path , mark the cell which is visited
        maze[r][c] = false;


        if(r < maze.length -1){
            allPaths(path + "D" , maze , r+1 , c);

        }

        if(c < maze[0].length -1){
            allPaths(path + "R" , maze , r , c+1);
        }

        if(r > 0){
            allPaths(path + "U" , maze , r-1 , c);
        }
        if(c > 0){
            allPaths(path + "L" , maze , r , c-1);
        }

        // function will be over here
        // so before the function gets removed , also remove the changes that were made by this recursion call
        maze[r][c] = true;
    }
/*    this method is called infinitely as there is no condition to stop recursion
    static void allPaths(String path , boolean[][] maze , int r , int c){
        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(path);
            return;
        }

        if(!maze[r][c]){
            return ;
        }

        if(r < maze.length -1){
            allPaths(path + "D" , maze , r+1 , c);

        }

        if(c < maze[0].length -1){
            allPaths(path + "R" , maze , r , c+1);
        }

        if(r > 0){
            allPaths(path + "U" , maze , r-1 , c);
        }
        if(c > 0){
            allPaths(path + "L" , maze , r , c-1);
        }
    }

 */
}

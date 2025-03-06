package Backtracking;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] arr = {{true, true , false},
                {true, true , true},
                {true,true,true}};
        path(arr , "" , 2 , 2);
    }

    static void path(boolean[][] arr , String path , int r , int c){
        if(c ==0 && r == 0){
            System.out.println(path);
            return;
        }

        if(c > 0 && arr[r][c]){
            path(arr , path + 'R' , r , c -1);
        }

        if(r > 0 && arr[r][c]){
            path(arr, path + 'D' , r - 1 , c);
        }

    }
}

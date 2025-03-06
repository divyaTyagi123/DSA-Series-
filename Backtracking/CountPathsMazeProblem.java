package Backtracking;

import java.util.ArrayList;

public class CountPathsMazeProblem {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
        printPath("" , 3 ,3);
        ArrayList<String> ans = listDiagonalPath("" , 3 , 3);
        System.out.println(ans);
    }

    // basic recursion program  but exceed time limit for large input

    static int countPath(int r , int c){
        if(r ==1 || c ==1){
            return 1;
        }

        int leftCount = 0;
        int rightCount = 0;

        leftCount = countPath(r , c -1);
        rightCount = countPath(r - 1 , c);

        return rightCount + leftCount;
    }

    static void printPath(String path ,int r , int c){
        if(r ==1 && c ==1){
            System.out.println(path);
            return;
        }

        if(c>1) {
            printPath(path + "R", r, c - 1);
        }
        if(r>1){
            printPath(path + "D", r - 1, c);
        }
    }

    static ArrayList<String> listPath(String path , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> result = new ArrayList<>();
            result.add(path);
            return result;         // returning list from local levels
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(c > 1){
            left = listPath(path + "R" , r , c-1);
        }
        if(r > 1){
            right = listPath(path + "D" , r-1 ,c);
        }

        left.addAll(right);
        return left;    // returning the final list when left and right lists are returned from a level
    }

    static ArrayList<String> listDiagonalPath(String path , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> result = new ArrayList<>();
            result.add(path);
            return result;         // returning list from local levels
        }
        ArrayList<String> list = new ArrayList<>();

        if(c > 1){
            list.addAll(listDiagonalPath(path + "R" , r , c-1));
        }
        if(r > 1){
            list.addAll(listDiagonalPath(path + "D" , r-1 ,c));
        }
        if(r > 1 && c > 1){
            list.addAll(listDiagonalPath(path + "C" , r-1 , c-1));
        }

        return list;    // returning the final list when left and right lists are returned from a level
    }

}

package Backtracking;

import java.util.ArrayList;

public class NStairs {
    public static void main(String[] args) {
        nStairs("" , 4);
    }

    static void nStairs(String list , int n){
        if(n == 0){
            System.out.println(list);
            return;
        }

        if(n>=1){
            nStairs(list + '1' , n -1);
        }
        if(n>=2){
            nStairs(list + '2' , n-2);
        }


    }
}

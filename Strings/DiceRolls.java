package Strings;

import java.util.ArrayList;

// AMAZON Question

public class DiceRolls {
    public static void main(String[] args) {
        System.out.println(dice(0,500,6 , 6));

    }

    static int dice(int p , int target , int n , int k ){
        if(n == 0 && target != 0){
            return 0;
        }
        else if(n == 0 && target == 0){
            return 1;
        }
        int count = 0;

        for(int i = 1 ; i <= k && i <=target ; i++){

            count = count + dice(i , target - i , n-1 , k);
        }

        return count;
    }

}

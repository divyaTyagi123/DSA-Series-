package Recursion;

// special example to return same value to above function

public class ZeroesInNum {
    public static void main(String[] args) {
        int n = 20435020;
        System.out.println("number of zeroes " + zeroes(n));
    }

    static int zeroes(int n ){
        //int c = 0;
        return helper(n,0);
    }

    private static int helper(int n , int c){
        if(n <= 0){
            return c;
        }
        if(n%10 == 0){
            c++;
        }
        return helper(n/10 , c);
    }
}

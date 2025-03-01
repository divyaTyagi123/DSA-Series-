package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 3456543;
        //System.out.println(palindrome(n)==n ? "yes" : "no");
        System.out.println(palindrome(n));
    }


    static boolean palindrome(int n){
        int digits = (int)(Math.log10(n)) +1;
        return helper(n,digits);
    }

    private static boolean helper(int n , int digits){
        int fd = n/(int)(Math.pow(10,digits-1)) % 10;
        if(fd != (n % 10)){
            return false;
        }

        helper(n/10 , digits-1);
        return true;
    }




    // first way

//    static int palindrome(int n){
//
//        int digits = (int)(Math.log10(n)) +1;
//        return helper(n,digits);
//    }
//
//    private static int helper(int n, int digits){
//        if(n%10 == n){
//            return n;
//        }
//        int rem = n % 10;
//        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
//    }
}

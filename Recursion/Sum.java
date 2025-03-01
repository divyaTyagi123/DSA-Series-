package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n = 3125;
        System.out.println(sumDigits(n));
        System.out.println(product(n));
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }
    static int sumDigits(int n ){
        if(n==0){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }
}

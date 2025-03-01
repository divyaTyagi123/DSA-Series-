package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0; i <= n ;i++){
            System.out.print(fibonacci(50) + " ");
        }
    }

    static int fibonacci(int n ){
        if(n == 0 || n ==1){
            return n;
        }
        
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
        
    }
}

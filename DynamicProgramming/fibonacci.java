import java.util.HashMap;

public class fibonacci{
    public static void main(String[] args){
        int n = 78;
        System.out.println(fib(n));

    }

    public static int fib(int n){
        return fib(n , new HashMap<>());
    }
    public static int fib(int n, HashMap<Integer,Integer> memo){
        if(n <= 1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1, memo) + fib(n-2 , memo);
        memo.put(n , result);

        return result ;
    }
}
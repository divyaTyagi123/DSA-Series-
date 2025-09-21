import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int result = stairs(n);
        System.out.println(result);

    }

    public static int stairs(int n){
        return stairs(n , new HashMap<>());
    }

    public static int stairs(int n, HashMap<Integer, Integer> memo){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = stairs(n-1 , memo ) + stairs(n-2 , memo);
        memo.put(n , result);

        return memo.get(n);
    }
}

import java.util.*;
public class MaxSum{
    static Map<String,Integer> dp = new HashMap<>();
    static int solve(int[] arr, int idx, int cur, int max){
        if(cur > max) return 0;
        if(idx == arr.length) return cur;
        String key = idx + "," + cur;  // index , current sum pair 
        if(dp.containsKey(key)) return dp.get(key);

        int inc = solve(arr, idx+1, cur+arr[idx], max);
        int exc = solve(arr, idx+1, cur, max);
        int res = Math.max(inc, exc);

        dp.put(key, res);

        return res;
    }


    public static void main(String[] args){
        int[] arr = {2,3,5,7};
        int max = 19;

        System.out.println(solve(arr, 0, 0, max));
    }
}
package BitManipulation;

import java.util.Arrays;


public class FindUnique2 {
    public static void main(String[] args) {
        int[] nums = {2,4,3,4,2,4,2};
        int max = Arrays.stream(nums).max().getAsInt();
        int n = countBits(max);

        int[] result = new int[n];

        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = 0 ; j < nums.length ; j++){
                int x = findBit(nums[j], i);
                if(x==1)   sum++;
            }
            result[i] = sum;
        }
        int r = 0;
        for(int i = 0 ; i < result.length; i++){
            result[i] = result[i]%3;
            r += result[i]*Math.pow(2,n-i);
        }

        System.out.println(r);
        
    }

    static int findBit(int num , int i){
        return (num & (1 << (i-1))) == 1  ? 1 : 0;
    }

    static int countBits(int n){
        return (int)(Math.log(n)/Math.log(2) +1);
    }
}

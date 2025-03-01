package BitManipulation;

import java.util.Arrays;

public class ConvertToBits {
    public static void main(String[] args) {
        int[] bits = convertToBits(5);
        System.out.println(Arrays.toString(bits));
    }

    static int[] convertToBits(int n){
        int b = (int) (Math.log(n) / Math.log(2) + 1);
        int[] bits = new int[b];
        int i = b-1;
        while(n!=0){
            bits[i] = n & 1;
            n = n>>1;
            i--;
        }
        return bits;
    }
}

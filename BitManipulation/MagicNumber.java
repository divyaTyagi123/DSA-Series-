package BitManipulation;
import java.util.Arrays;
public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);

        //int[] bits = convertToBits(n);
        //int magicNum = magicNumber(bits);
    }

    static int magicNumber(int[] bits){
        int n = bits.length;
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            result = result + (bits[i] * (int)Math.pow(5,n-i));
            
        }

        return result;
    }


    static int[] convertToBits(int n){
        int b = (int) (Math.log(n)/Math.log(2) +1);   // count digits (no of bits)
        
        int[] bits = new int[b];
        int i = b-1 ;
        while(n!=0){
            bits[i] = n & 1;              // last binary digit (bit)
            n = n >> 1;
            i--;
        }
        return bits;
    }
}

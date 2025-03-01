package BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(countSetBits(n));
    }

    static int countSetBits(int n){
        int c = 0;
        while(n>0){
            c++;
            n = n - (n & (-n));
        }
        return c;
    }
    
}

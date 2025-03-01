package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 32;
        int n = 32;
        int i = 1;
        int j = 6;
        System.out.println(setBit(num , i));
        System.out.println(resetBit(n , j));
    }

    static int setBit(int n , int i){
        int mask = 1 << (i-1);
        int result = n | mask;
        return result;
        
        
    }

    static int resetBit(int n , int i ){
        int mask = ~(1 << (i-1));
        int result = n & mask;
        return result;
    }
}

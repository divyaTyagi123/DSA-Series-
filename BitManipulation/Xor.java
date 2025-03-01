package BitManipulation;

public class Xor {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;

        System.out.println(a==0 ? xor(b) : xorRange(a,b));
    }

    static int xorRange(int a , int b){
        return xor(b) ^ xor(a-1);
    }

    static int xor(int b){
        if(b % 4 == 0){
            return b;
        }
        else if(b % 4 == 1){
            return b;
        }
        else if(b % 4 == 2){
            return b+1;
        }
        else {
            return 0;
        }
    }
}

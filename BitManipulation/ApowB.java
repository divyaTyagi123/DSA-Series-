package BitManipulation;

public class ApowB{
    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        int result = pow(a,b);

        System.out.println(result);
    }

    static int pow(int a, int b){
        int ans = 1;
        int base = a;

        int n = b;

        while(n>0){
            if((n & 1) == 1){
                ans *= base;    
            }
            base = base * base;
            n = n >> 1;
        }

        return ans;
    }
}
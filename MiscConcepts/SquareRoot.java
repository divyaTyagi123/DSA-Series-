package MiscConcepts;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",sqrt(n,p) );
    }

    //time : O(log(n))

    static double sqrt(int n, int p ){
        int s  = 1;
        int e = n;

        double root = 0.0;

        while(s <= e){
            int m = s + (e-s)/2;

            if(m*m == n){
                return root;
            }
            else if(m*m > n){
                e = m -1;
            }
            else
                s = m +1;
        }

        double incr = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += incr;
            }

            root -= incr ;
            incr /= 10;
        }

        return root;
        /*  for root of perfect square 
         
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                e = mid-1;
            }
            else 
            s = mid+1;
        }
        return -1;
        */
    }
}

package MiscConcepts;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];

        sieve(n , primes);
        for(int i = 2 ; i<=n ; i++){
            if(!primes[i])
                System.out.println(i);
        }
    
    }

    static void sieve(int n , boolean[] primes){
        
        for(int i = 2; i*i <= n ; i++){
            if(!primes[i]){
                for(int j = i*2 ; j <= n ; j = j+i){
                    primes[j] = true;
                }
            }
        }
    }

    /*
     
    
    static boolean isPrime(int n){
        if(n <= 1)    
        return false;
        
        int i = 2;
        while(i*i <= n){
            System.out.println(i);
            if(n % i ==0)
            return false;
        }
        
        return true;
    }
    */
}

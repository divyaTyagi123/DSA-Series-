package BitManipulation;

public class PowerOf2{
    public static void main(String[] args) {
        int n = 32;

        if((n & (n-1)) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        /*    1st method
        int c = 0;
        boolean result = true;
        while(n>0){
            
            if((n & 1) == 1){
                c++;
            } 
            n = n >> 1;
            if(c>1){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println(" yes this is a power of 2 ");
        }
        else 
        System.out.println(" no this is not a power of 2 ");
        */
    }
}
package MiscConcepts;
import java.util.ArrayList;

public class Factor{
    public static void main(String[] args) {
        int n = 20;
        factor1(n);
        System.out.println();
        factor2(n);
        System.out.println();
        factor3(n);
    }

    // O(n)
    static void factor1(int n){
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))

    static void factor2(int n){
        for(int i = 1 ; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    // time : O(sqrt(n))  space: O(sqrt(n))
    static void factor3(int n){

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    lst.add(n/i);
                }
            }
        }
        for(int i = lst.size()-1 ; i>= 0 ; i--){
            System.out.print(lst.get(i)+" ");
        }
    }

}
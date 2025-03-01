package Patterns;

public class BasicPattern {
    public static void main(String[] args) {
        Pattern1(5);
        Pattern2(5);
        Pattern3(5);
        Pattern28(5);
    }

    static void Pattern28(int n){
        for(int i = 1; i <= 2*n -1; i++){
            int sp = i < n ? n-i : i - n ;
            int st = i < n ? i : 2*n-i;

            for(int j = 1; j <= sp;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= st ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Pattern1(int n ){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n){
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        for(int i = 1; i <= 2*n ; i++){
            int totalCol = i > n ? 2*n-i : i;
            for(int j = 1 ; j <= totalCol ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}

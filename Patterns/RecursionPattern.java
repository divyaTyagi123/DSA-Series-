package Patterns;

public class RecursionPattern {
    public static void main(String[] args) {
        int n = 5;
        star(n);
    }
    /*
    static void star(itn r , int c){
        if(c == 0)
            return;
        if(c < r ){
            star(r, c+1);
            sout("*);
        }
        else{
            sout();
            star(r-1 , 0);
        }
    }
     */

    static void star(int n ){
        if(n < 1){
            return;
        }
        row(n);
        System.out.println();
        star(n-1);
    }

    static void row(int n){
        if(n <1)
            return;
        System.out.print("#");
        row(n-1);
    }
}

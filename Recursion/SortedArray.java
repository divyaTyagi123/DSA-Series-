package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,9};
        System.out.println(sorted(arr,0));
    }


    static boolean sorted(int[] a , int i){
        if(i == a.length -1)
            return true;
        if(a[i] > a[i]+1)
            return false;
        else
            return a[i] < a[i]+1 && sorted(a,i+1);
    }

    /*
    static boolean sorted(int[] a ){
        int i = 0;
        while(i<a.length-1){
            if(a[i] < a[i+1])
                i++;
            else
                return false;
        }
        return true;
    }

    */
}

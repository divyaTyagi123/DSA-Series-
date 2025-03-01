package Recursion;
import java.util.Arrays;

public class SelectionSortRecur {
    public static void main(String[] args) {
        int[] arr = {2,45,1,6,14,7,8,5};
        selectionSort(arr, 0 , 0 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] a , int i , int j , int m){
        if(i == a .length)
            return;
        if(j < a.length){
            if(a[j] < a[m]){
                m = j;
            }
            selectionSort(a , i , j+1 , m);
        }else{
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }

        selectionSort(a, i+1 , i+1 , i+1);


    }
}

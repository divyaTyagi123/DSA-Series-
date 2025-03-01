package Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        quickSort(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr , int p , int r){

        if(p < r){
            int q = partition(arr, p , r);

            quickSort(arr, p , q-1);
            quickSort(arr , q+1 , r);
        }
        else{
            return;
        }
    }

    static int partition(int[] arr , int p , int r){
        int x = arr[r];
        int i = p-1;
        int j = p;

        while(j <= r-1){
            if(arr[j] <= x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;

    }

}

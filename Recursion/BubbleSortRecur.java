package Recursion;
import java.util.Arrays;

public class BubbleSortRecur {
    public static void main(String[] args) {
        int [] arr = {6,4,3,2,1 , 90 , 43};
        bubbleSort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] a , int i , int j){
        if(i == a.length-1)
            return;
        if(j<a.length -i -1){
            if(a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
            bubbleSort(a , i ,j+1);
        }
        else{
            bubbleSort(a , i+1 , 0);
        }

    }

}

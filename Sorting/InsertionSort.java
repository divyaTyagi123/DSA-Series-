package Sorting;

import java.util.Arrays;

// no of swaps are less than bubble sort , stable sort , used for smaller value of n , good for arrays with partially sorted values , 
// takes part in hybrid sorting algo

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = { 5,6,2,8,1,9};
        int n = arr.length;

        for(int i = 0; i < n - 1 ; i++){
            for(int j = i+1 ; j >0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else 
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}





// time complexity is sum of n natural numbers   O(n^2)
// best case O(n)



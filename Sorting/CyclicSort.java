package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int n = arr.length;

        cyclicSort(arr,n);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr,int n){
        int i = 0;
        while(i<n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
    }

    static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

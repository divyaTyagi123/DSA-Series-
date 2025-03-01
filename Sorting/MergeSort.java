package Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,10,3,1};
        arr = mergeSort1(arr);
        System.out.println(Arrays.toString(arr));

        int[] nums = {3,54,6,70,2,98,7,26};
        mergeSort2(nums, 0 , nums.length);

        System.out.println(Arrays.toString(nums));
    }

    //============================inplace algo ===============================

    static void mergeSort2(int[] arr , int s , int e){
        if(e - s == 1)
            return ;

        int mid = (e + s )/ 2;

        mergeSort2(arr , s ,mid);
        mergeSort2(arr, mid , e);

        merge2(arr, s , mid , e);
    }

    static void merge2(int[] arr , int s, int m , int e ){

        int[] result = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j <e){
            if(arr[i] < arr[j]) {
                result[k] = arr[i];
                i++;
                k++;
            }
            else{
                result[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i < m ){
            result[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            result[k] = arr[j];
            j++;
            k++;
        }

        for(int x = 0; x < result.length; x++){
            arr[s + x] = result[x];
    }
}



//  ============================== this is not inplace algo =================================
    static int[] mergeSort1(int[] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort1(Arrays.copyOfRange(arr , 0 ,mid));
        int[] right = mergeSort1(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left , right);
    }

    static int[] merge(int[] left , int[] right){
        int m = left.length;
        int n = right.length;
        int[] result = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j <n){
            if(left[i] < right[j]) {
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < m ){
            result[k] = left[i];
            i++;
            k++;
        }

        while(j < n){
            result[k] = right[j];
            j++;
            k++;
        }



        return result;
    }
}

package Sorting;
import java.util.Arrays;

// select smallest element and awap with first element
// not stable algo and good for short lists

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        int n = array.length;
        
        for(int i = 0; i < n ; i++){
            int smallest = array[i];
            int s = i;

            for(int j = i+1 ; j<n; j++){
                if(array[j] < smallest ){
                    smallest = array[j];
                    s = j;
                }
            }

            int temp = array[i];
            array[i] = smallest;
            array[s] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}


// time complexity   1,2,3,4.....(n-1)
// sum of n natural numbers = (n * (n+1)) / 2
// here    ((n-1) * (n-1+1)) /2  = (n * (n+1)) / 2 =  O(n^2)
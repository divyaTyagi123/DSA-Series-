package Sorting;
import java.util.Arrays;

// select smallest element and awap with first element
// not stable algo and good for short lists

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {35,87,5,4,3,2,1,45,90};
        int n = array.length;


        for(int i = 0; i < n; i++){
            int largest = array[n-1-i];
            int l = n-1-i;

            for(int j = n-i-1; j>=0 ; j--){
                if(array[j] > largest){
                    largest = array[j];
                    l = j;
                }
            }
            System.out.println(largest);
            int temp = array[n-i-1];
            array[n-i-1] = array[l];
            array[l] = temp;
        }

        
        // for(int i = 0; i < n-1 ; i++){
        //     int smallest = array[i];
        //     int s = i;

        //     for(int j = i+1 ; j<n; j++){
        //         if(array[j] < smallest ){                    // smallest element search
        //             smallest = array[j];
        //             s = j;
        //         }
        //     }

        //     int temp = array[i];
        //     array[i] = smallest;
        //     array[s] = temp;
        // }

        System.out.println(Arrays.toString(array));
    }
}



// time complexity   1,2,3,4.....(n-1)
// sum of n natural numbers = (n * (n+1)) / 2
// here    ((n-1) * (n-1+1)) /2  = (n * (n+1)) / 2 =  O(n^2)
package Sorting;
import java.util.Arrays;
 
// sort by compairing adjacent elements       also known as sinking sort and exchange sort    inplace algo as no extra space is needed
// largest element goes to end in each iteration
// start from beginning and compare each element and swap for right place , in each iteration grater elemtn goes to end one by one
// n-1 passes

// while running 
// for compilation use javac Sorting/BubbleSort.java
// for running use java Sorting.BubbleSort

// T(n) = O(n^2)

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {3,1,5,4,0,-5,56,-8,2};

        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array.length - 1 -i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}


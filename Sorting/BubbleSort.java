package Sorting;
import java.util.Arrays;
 
// sort by compairing adjacent elements       also known as sinking sort and exchange sort    inplace algo as no extra space is needed

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {3,1,5,4,2};

        for(int i = 0;i < array.length; i++){
            for(int j = 1;j < array.length -i ; j++){
                if(array[j] < array[j-1]){
                    int temp  = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
        
}

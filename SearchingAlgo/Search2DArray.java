package SearchingAlgo;
import java.util.Arrays;

// sorted in rowwise and columnwise manner 

public class Search2DArray{
    public static void main(String[] args){
        int[][] array = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,27,49},
            {33,34,38,50}
        };

        int target = 29;
        int[] index = search(array,target);
        System.out.println(" target found at index" + Arrays.toString(index));
    }

    static int[] search(int[][] array ,int target){
        int row = 0;
        int col = array.length - 1;
        while(row>=0 && col<array.length){
            if(target == array[row][col]){
                return new int[] {row,col};
            }
            else if(target>array[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        
        return new int[] {-1,-1};
    }
}
package SearchingAlgo;
import java.util.Arrays;

public class Search2DArray2 {
    // all elements are sorted continuously 
    public static void main(String[] args){
        int[][] array = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 1;
        int[] index = search(array,target);

        System.out.println(Arrays.toString(search(array,target)));
    } 

    static int[] search(int[][] array,int target){
        // this method will search using mid row then BS in that row
        int n = array.length;
        int rStart = 0;
        int rEnd = n-1;
        
        while(rStart <= rEnd ){
            int mrow = rStart + (rEnd - rStart)/2;
            int m = array[mrow].length-1;
            int col = BinarySearch(array[mrow],target,0,m);

            if(col != -1)    return new int[] {mrow,col};
            else{
                if(array[mrow][0] > target){
                    rEnd = mrow - 1;
                }
                else if(array[mrow][m] < target){
                    rStart = mrow + 1;
                }
            }
        }

        return new int[] {-1,-1};
    }

    // this will return the index of target in the given row passed to it otherwise -1
    static int BinarySearch(int[] array,int target, int cStart , int cEnd){
        while(cStart <= cEnd){
            int mcol = cStart + (cEnd - cStart)/2;

            if(array[mcol] == target)   return mcol;
            else if(array[mcol] > target) 
                cEnd = mcol-1;
            else
                cStart = mcol + 1;
        }
        
        return -1;
    }
}

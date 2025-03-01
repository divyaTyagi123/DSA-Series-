package SearchingAlgo;
import java.util.Arrays;

public class QuesLS {
    public static void main(String[] args){
        String name = "Divya";
        char ch = 'y';
        boolean contain = search(name,ch);
        System.out.println(contain);

        //search in 2d array
        int [][] array = {
            {2,3,4},
            {4,56,67},
            {89,12,32}
        };
        int target = 1;
        int[] ans = search2(array,target);
        System.out.println(Arrays.toString(ans));

  }
// 1 . ==================================================================================================
  static boolean search(String name , char ch ){
    if(name.length()==0)
        return false;
    // we can also use this method to convert string into array 

    for(char c : name.toCharArray()){
        if(c == ch){
            return true;
        }
    }
    
    // for(int i = 0;i<name.length();i++){
    //     if(name.charAt(i) == ch){
    //         return true;
    //     }
    // }
    return false;
  }

// 2. ============================================================================================
  static int[] search2(int[][] array, int target){
    for(int row = 0;row  < array.length ; row++){
        for(int col = 0;col < array[row].length ; col++){
            if(array[row][col]== target ){
                return new int[] {row,col};
            }
        }
    }
    return new int[] {-1,-1};
  }

}

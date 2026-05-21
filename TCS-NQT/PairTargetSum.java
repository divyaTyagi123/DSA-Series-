import java.util.Arrays;
// Find pair whose sum is target 

// first is nested loop whose T(n) = O(n^2)

// second we can use sorting(built-in) T(n) = O(nlogn)  --> 
// on sorted array use two pointers , i and j , if target > current sum -> we need to decrease so move j <-  
// if target < currentsum -> we need to increase so move i -> 




public class PairTargetSum{
    public static void main(String[] args){

        int[] arr = {5,0,3,7,1,8,2};
        int target = 17;

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length -1;

        int currentSum = 0;

        while(i < j){
        
            currentSum = arr[i] + arr[j];

            if(target == currentSum){
                System.out.println(arr[i] + " & " + arr[j] + " is the desired pair");
                break;
            }
            else if(target > currentSum){
                i++;
            }
            else {
                j--;
            }
        }
        if(i >= j){

            System.out.println("Not Found");
        }
    

    }
}
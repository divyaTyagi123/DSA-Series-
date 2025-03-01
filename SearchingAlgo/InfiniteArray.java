package SearchingAlgo;
import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,10,11,12,12,13,15,16,19,20,25,26,29,30,31,35};
        int target = 8;
        int index = findInfinite(nums,target);
        System.out.println(index);

        
    }   

    static int findInfinite(int[] nums,int target){
        int start = 0;
        int end = 1;

        while(target>nums[end]){
            int temp = start;
            end = end + (end - start +1)*2;
            start = temp;
        }
        
    
        return binarySearch(nums,start,end,target);
    }

    static int binarySearch(int[] nums,int s ,int e, int target){
        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[mid] >target){
                e = mid-1;
            }
            else if(nums[mid] <target){
                s = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    
    
}

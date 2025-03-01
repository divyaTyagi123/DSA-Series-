package SearchingAlgo;
public class RotatedArrayDuplicate {
    public static void main(String[] args){
        int[] nums = {2,9,10,12,2,2,2};
        int target = 9;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int n = nums.length;
        
        if(n==1 && nums[0] == target)       
            return 0;
        else if(n==1 && nums[0]!= target)    
            return -1;

        if(pivot == -1)      
            return binarySearch(nums,target,0,n-1);
        if(nums[pivot] == target)
            return pivot;
        if(nums[0] <= target)    
            return binarySearch(nums,target,0,pivot-1);
           
        return binarySearch(nums,target,pivot+1,n-1);
        
    }

    static int findPivot(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        if((n!= 0 && n!=1) && nums[0] > nums[1])      return 0;
        if((n!= 0 && n!=1) && nums[n-1] < nums[n-2])  return n-2;
        if(n==1)   return 1;
        if(n==0)   return -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[s] == nums[mid] && nums[e] == nums[mid]){ 
                if(nums[s] >nums[s+1]){
                    return s;      //if start is pivot return
                }
                s++;

                if(nums[e] < nums[e-1]) {
                    return e-1;        // if end-1 is pivot return
                }
                e--;
            }

            else if(nums[s] < nums[mid] || nums[s] ==  nums[mid] && nums[mid] > nums[e]){
                s = mid + 1;
            }
            else{
                e = mid-1;
            }

            if(mid < e && nums[mid] > nums[mid+1])       return mid;
            else if(mid > s && nums[mid] < nums[mid-1])  return mid-1;
            
            else if(nums[s] >= nums[mid])      e = mid-1;
            else       s = mid+1;
        }
        return -1;
    }

    static int binarySearch(int[] nums,int target,int s,int e){
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] > target)   e=m-1;
            else if(nums[m] < target)  s = m+1;
            else  return m; 
        }
        return -1;
    }
}

package SearchingAlgo;
public class CeilNum{
    public static void main(String[] args){
        int[] arr = {2,4,5,6,9,12,15,20};
        int target = 21;
        int ceil = findCeil(arr,target);
        int floor = findFloor(arr,target);
        System.out.println("ceil of target number is :" + ceil);
        System.out.println("floor of target number is :" + floor);

    }

    static int findCeil(int[] arr , int target){
        if(arr[arr.length -1] < target){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
           
        return arr[start];
    }

    static int findFloor(int[] arr,int target){
        if(arr[0] > target){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return arr[end];
    }
}
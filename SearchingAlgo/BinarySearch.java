package SearchingAlgo;
public class BinarySearch{
    public static void main(String[] args){
        int [] array = {3,4,5,7,8,9,10,12};
        int target = 10;
        System.out.println("Target found at : " + (index(array,target)+1));
    }

    static int index(int[] array, int target){
        int start = 0;
        int end = array.length -1 ;
        while(start<=end){
            //int mid = (start+end)/2;

            int mid = start + (end-start)/2;
           
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

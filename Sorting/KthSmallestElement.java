// Selection sort till k will find kth smallest element 

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 1};
        int k = 3;
        System.out.println(kthSmallestElement(arr, k));
    }

    public static int kthSmallestElement(int[] arr, int k){
        for(int i = 0; i < k; i++){
            for (int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        return arr[k-1];
    }
}

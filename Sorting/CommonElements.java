import java.util.ArrayList;
import java.util.Arrays;

class CommonElements{
    public static void main(String[] args) {
        int [] arr1 = {3,1,2,1,1,4,5,5};
        int [] arr2 = {6,1,1,4,4,2,8};

        ArrayList<Integer> result = commonElements(arr1, arr2);
        
        System.out.println(result.toString());
    }


    public static ArrayList<Integer> commonElements(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while(i < n1 && j < n2){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }            
        }
        return result;
    }
}
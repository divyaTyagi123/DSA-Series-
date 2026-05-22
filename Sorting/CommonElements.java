import java.util.ArrayList;
import java.util.Arrays;

class CommonElements{
    public static void main(String[] args) {
        int [] arr1 = {3,4,2,2,4};
        int [] arr2 = {3,2,2,7};

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
            }
            i++;
            j++;
        }
        return result;
    }
}
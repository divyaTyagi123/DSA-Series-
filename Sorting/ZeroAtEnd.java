import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;

public class ZeroAtEnd {
    public static void main(String[] args){
        int [] array = {0,0,9,4,0,24,0,4,0,2,0,23,0,21};
        int n = array.length;

        // for(int i = 0; i<n; i++){
        //     for(int j = 1; j < n- 1 -i; j++){
        //         if(array[j] == 0){                                          // O(n^2)
        //             array[j] = array[j+1];
        //             array[j+1] = 0;
        //         }
        //     }
        // }

        // Taking extra space

        int [] helper = new int[n];
        int count = 0;
        int j = 0;

        for(int i = 0; i<n ; i++){
            if(array[i] != 0){
                helper[j] = array[i];
                j++;
            }
            else
                count++;
        }
        for(int i = n-count +1; i<n; i++){
            helper[i] = 0;
        }



        System.out.println(Arrays.toString(helper));
    }
}

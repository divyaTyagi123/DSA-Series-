package BitManipulation;

public class FindUniqueNum {
    public static void main(String[] args) {
        int[] num = {2,4,5,3,6,3,2,4,6};
        System.out.println(uniqueNum(num));
    }

    static int uniqueNum(int[] num){
        int result = 0;
        for(int n : num){
            result = result ^ n ;
        }

        return result;
    }
}

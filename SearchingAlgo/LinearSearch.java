package SearchingAlgo;
import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int [] array = new int[n] ;

        for(int i = 0; i < n;i++){
            System.out.print("Enter element : ");
            array[i] = sc.nextInt();
        }

        System.out.print("enter item to be searched :");
        int item = sc.nextInt();

        int index = linearSearch(array,item);

        System.out.println("Item found at index :" + index);
    }

    static int linearSearch(int[] array , int item){
        if(array.length == 0)
            return -1;
        for(int i = 0; i<array.length; i++){
            if(array[i] == item){
                return i;
            }
        }
        return -1;
    }
}
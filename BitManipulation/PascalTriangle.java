package BitManipulation;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;

        int sumOfNthRow = 1 << (n-1);
        System.out.println(sumOfNthRow);
    }
}

package BitManipulation;

public class FindBit {
    public static void main(String[] args) {
        int num = 69;
        int i = 1;
        System.out.println(findIthBit(num , i));
    }

    static int findIthBit(int num , int i){
        //num = num >> i-1;
        //return (num & 1) == 1 ? 1 : 0 ;

        //another way is to create a mask which has i-1 zeroes in it 0001000, 1 is at i place

        return (num & (1<< (i-1))) == 1 ? 1 : 0;
    }
}

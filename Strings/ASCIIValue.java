package Strings;

public class ASCIIValue {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0);
        System.out.println((char)(ch + 1));

        for(char c = '1' ; c <= '9' ; c++){
            System.out.println(c);
        }
    }
}

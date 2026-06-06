import java.util.Arrays;
import java.util.Scanner;


public class MostFreqChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result = mostFreq(str);
        System.out.println(result);
    }

    static char mostFreq(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        int i = 0, j = 0;
        int mostFreq = 0;
        char ans = charArray[0];
        while(j < charArray.length){
            
            if(charArray[i] == charArray[j]){
                j++;
            }else{
                int freq = j - i;
                if(mostFreq < freq){
                    mostFreq = freq;
                    ans = charArray[i];
                }

                i = j;
            }
        }

        return ans;
    }
}

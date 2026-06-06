import java.util.Arrays;
import java.util.Scanner;


public class MostFreqChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result = mostFreq(str);
        System.out.println(result);

        char result2 = mostFreq(str);
        System.out.println(result2);
    }

    // Sliding Window
    // T(n) = O(nlogn)

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
        int freq = j - i;
        if(mostFreq < freq){
            mostFreq = freq;
            ans = charArray[i];
        }

        return ans;
    }


    // Frequency array 
    // T(n) = O(n)
    static char mostFreqChar(String str){
        char[] freqArray = new char[26];
        int n = str.length();
        int maxFreq = -1;

        char[] arr = str.toCharArray();
        char ans = arr[0];

        for(int i = 0 ; i < n ; i++){
            freqArray[arr[i] - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freqArray[i] > maxFreq){
                maxFreq = freqArray[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
}

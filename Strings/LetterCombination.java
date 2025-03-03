package Strings;
import java.util.List;
import java.util.ArrayList;

//  GOOGLE QUESTION

public class LetterCombination {
    public static void main(String[] args) {
        List<String> combinations = letterCombinations("589");
        System.out.println(combinations);

        pad("" , "12");
    }

    //another optimize method
    static void pad(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0';     //this will convert '2' into 2 as ascii value of '2' - '0' have the same difference as 2-0
        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char) ('a' + i);
            pad(p + ch , up.substring(1));
        }
    }

    static List<String> letterCombinations(String digits){
        return combo("",digits);
    }

    static List<String> combo(String p, String up){
        if(up.isEmpty()){
            List<String> r = new ArrayList<>();
            r.add(p);
            return r;
        }

        List<String> result = new ArrayList<>();
        String[] alpha = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        //String ch = "" + up.charAt(0);
        //int d = Integer.parseInt(ch);
        char ch = up.charAt(0);
        int d = Character.getNumericValue(ch);

        int i = d-2;         // index of array corresponding to digit

        String letters = alpha[i];  // string corresponding to digit

//        for(int j = 0 ; j < letters.length(); j++){
//            List<String> ans = combo(p+letters.charAt(j), up.substring(1) );
//
//            result.addAll(ans);
//        }

        for (char letter : letters.toCharArray()) {
            result.addAll(combo(p + letter, up.substring(1)));
        }

        return result;
    }
}


//char ch = 'a';               97
//int i = '2';                 50
//Integer.parseInt(string)     to integer digit

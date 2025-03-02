package Strings;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutations("","abc");

        ArrayList<String> permutation = permutation3("" , "abc");
        System.out.println(permutation);

        System.out.println(countPermutations("","abc"));
    }

    //no of recursive calls = size of processed string
    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        for(int i= 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());

            permutations(f + ch + l , up.substring(1));
        }
    }

//    static ArrayList<String> permutation2(String p, String up){
//        if(up.isEmpty()){
//            return new ArrayList<>();
//        }
//        ArrayList<String> result = new ArrayList<>();
//
//        char ch = up.charAt(0);
//
//        int l = p.length();
//        for(int j = 0 ; j <= l ; j++){
//            String f = p.substring(0,j);
//            String s = p.substring(j , l);
//            ArrayList<String> ans = permutation2(f + ch + s , up.substring(1));
//
//            result.addAll(ans);
//        }
//        return result;
//    }

    // upper method will return an empty list only
    static ArrayList<String> permutation3(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        char ch = up.charAt(0);

        int l = p.length();

        ArrayList<String> ans = new ArrayList<>();
        for(int j = 0 ; j <= l; j++){
            String f = p.substring(0,j);
            String s = p.substring(j,l);

            ArrayList<String> process = permutation3(f+ch+s, up.substring(1));

            ans.addAll(process);
        }

        return ans;
    }

    // counting the no of ans of permutations

    static int countPermutations(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int l = p.length();
        char ch = up.charAt(0);

        int count = 0;
        for(int j = 0 ; j <= l; j++){
            String f = p.substring(0,j);
            String s = p.substring(j,l);

            count = count + countPermutations(f+ch+s, up.substring(1));

        }

        return count;
    }
}

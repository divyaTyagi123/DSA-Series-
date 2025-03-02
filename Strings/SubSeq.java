package Strings;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {

        subSeq("abc", "");

        //ArrayList<String> result = subSeq1("abc" , "");
        //System.out.println(result);
        System.out.println(subSeq1("abc" , ""));
    }

    static void subSeq(String ori, String ans){
        if(ori.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = ori.charAt(0);

        subSeq(ori.substring(1) , ans + ch);
        subSeq(ori.substring(1) , ans);
    }

    static ArrayList<String> subSeq1(String ori, String ans){
        if(ori.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = ori.charAt(0);

        ArrayList<String> left = subSeq1(ori.substring(1) , ans + ch);
        ArrayList<String> right = subSeq1(ori.substring(1) , ans);

        left.addAll(right);
        return left;
    }
}

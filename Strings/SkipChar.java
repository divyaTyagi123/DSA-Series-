package Strings;

public class SkipChar {
    public static void main(String[] args) {
        String s  = "baccad";
        String ans = skipChar(s , "" , 0 );
        System.out.println(ans);

        System.out.println(skipChar2("adkafjakljfl" , ""));

        System.out.println(skipChar3(" kaoaaaakdj"));
    }

    //=============================================================

    static String skipChar3(String ori){
        if(ori.isEmpty()){
            return "";
        }
        char ch = ori.charAt(0);

        if(ch == 'a'){
            return skipChar3(ori.substring(1));
        }
        else{
            return ch + skipChar3(ori.substring(1));
        }
    }

    //=================================================================

    static String skipChar2(String ori , String up){
        if(ori.isEmpty()){
            return up;
        }
        char ch = ori.charAt(0);
        if(ch == 'a'){
            return skipChar2(ori.substring(1),up);

        }
        else{
            return skipChar2(ori.substring(1) , up+ch);
        }
    }

    //======================================================================

    static String skipChar(String s , String ans , int i){
        if( i == s.length() )
            return ans;
        if(s.charAt(i) != 'a')
            ans = ans + s.charAt(i);

        return skipChar(s , ans , i+1);
    }
}

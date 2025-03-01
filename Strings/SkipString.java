package Strings;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("myappjuiceapple" , "app"));
    }

    static String skipString(String ori , String t ){
        if(ori.isEmpty()){
            return "";
        }

        if(ori.startsWith(t) && !ori.startsWith("apple")){
            return skipString(ori.substring(t.length()) , t);
        }
        else{
            return ori.charAt(0) + skipString(ori.substring(1) , t);
        }
    }

    static String skipStringApple(String ori , String t ){
        if(ori.isEmpty()){
            return "";
        }

        if(ori.startsWith(t) ){
            return skipStringApple(ori.substring(t.length()) , t);
        }
        else{
            return ori.charAt(0) + skipStringApple(ori.substring(1) , t);
        }
    }
}

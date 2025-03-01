package MiscConcepts;
public class GCDandLCM{
    public static void main(String[] args){
        System.out.println(gcd(24,60));
        System.out.println(lcm(67,90));
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b){
        if(a==0)    
            return b;
        return gcd(b%a,a);
    }
}

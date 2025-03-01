package Recursion;

import java.util.ArrayList;

public class LinSearchRecur {
    public static void main(String[] args) {
        int[] arr = {2,45,90,3,6,8,90,3,5,90};
        int target = 90;
        System.out.println("Target found at position : " + (search(arr,target,0)+1));

        ArrayList<Integer> l = new ArrayList<>();
        search(arr,target,0,l);
        System.out.println(l);
    }

    static int search(int[] a , int t , int i){
        if(i == a.length-1 && a[i]!=t){
            return -1;
        }
        if(a[i] == t)
            return i;
        else
            return search(a,t,i+1);
    }

    // returning an arraylist as our answer
    static ArrayList<Integer> search(int[] a , int t , int i , ArrayList<Integer> l){
        if(i == a.length )
            return l;
        if(a[i] ==t)
            l.add(i);
        return search(a,t,i+1,l);
    }

    // returning an arraylist but not pass in argument but not optimized as space complexity is high
    static ArrayList<Integer> search2(int[] a , int t, int i){
        ArrayList<Integer> l = new ArrayList<>();
        if(i == a.length)
            return l;
        if(a[i] == t)
            l.add(i);
        ArrayList<Integer> ansFromBelowCalls = search2(a , t , i+1);

        l.addAll(ansFromBelowCalls);

        return l;
    }
}

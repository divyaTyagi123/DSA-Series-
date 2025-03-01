package Recursion;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3};
        int target = 60;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] a , int t, int s, int e){
        if(s>e)
            return -1;
        int m = s + (e - s)/2;
        if(a[m] == t){
            return m ;
        }
        if(a[s] <= a[m]){
            if(t >= a[s] && t <= a[m])
                return search(a ,t , s ,m-1);
            else
                return search(a ,t , m+1, e);
        }
        else{
            if (t >= a[m] && t <= a[e])
                return search(a, t, m + 1, e);
            else
                return search(a, t, s, m - 1);
        }
    }
}

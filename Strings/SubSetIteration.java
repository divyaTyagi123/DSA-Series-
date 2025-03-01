package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubSetIteration {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//
//        List<List<Integer>> ans = subset(arr);
//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }
//
//        System.out.println();

        int[] arrDup = {1,2,2};

        List<List<Integer>> ansDup = subsetDuplicate(arrDup);
        for(List<Integer> l : ansDup){
            System.out.println(l);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0 ; i < n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length ; i++){
            start = 0;

            // if previous element is same to current then move the start pointer

            if(i > 0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size() -1;
            int n = outer.size();

            for(int j = start ; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}


package com.array.test;

import java.util.*;

public class TopKElements347 {

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
//        int [] nums = {1, 2};
        int k = 2 ;

        System.out.println(Arrays.toString(findTopKElements(nums, k)));

    }

    private static int [] findTopKElements(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int n : nums){
            if(!countMap.containsKey(n))
                countMap.put(n, 1);
            else
                countMap.put(n, countMap.get(n) + 1);
        }

        System.out.println(countMap);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println(list);
        int [] res = new int[k];

        if(k == 1){
            res[0] = list.get(0).getKey();
            return res;
        }


        for(int i = 0; i< k; i++){
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}

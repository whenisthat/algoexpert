package com.practice.algoexpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] input, int target){
       Arrays.sort(input);
        List<Integer[]> result = new ArrayList<>();
        for(int i = 0 ; i < input.length - 2 ; i++){
            int left = i+1;
            int right = input.length-1;
            while(left < right) {
                int sum = input[i] + input[left] + input[right];
                if (target == sum) {
                    Integer[] val = {input[i], input[left], input[right]};
                    result.add(val);
                    left++;
                    right--;
                } else if (sum > target){
                    right--;
                }else{
                    left++;
                }
            }

        }
        return result;
    }

}

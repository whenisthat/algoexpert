package com.practice.algoexpert.arrays;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*  Write a function that takes in a non-empty array of distinct integers and an
      integer representing a target sum. If any two numbers in the input array sum
      up to the target sum, the function should return them in an array, in any
      order. If no two numbers sum up to the target sum, the function should return
      an empty array.*/
public class TwoNumberSum {

    public static int[] getTwoNumberSum(int[] source,int sum){
        int[] result = {};
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0 ; i < source.length ; i++){
            int temp = source[i];
            if(indexMap.containsKey(temp)){
                result = new int[2];
                result[0] = indexMap.get(temp);
                result[1] = i;
                return result;
            }
            indexMap.put(sum-source[i],i);
        }
        return result;
    }
}

package com.practice.algoexpert.arrays;

import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int n) {
        int i = 0 , j = array.size()-1;
        while( i < array.size() && j >= 0 && i < j){
            while(i < array.size() && array.get(i)!= n){
                i++;
            }
            while(j >= 0 && array.get(j) == n){
                j--;
            }

            if(i < array.size() && j >= 0 && i < j){
                int temp = array.get(i);
                array.set(i,array.get(j));
                array.set(j,temp);
            }
        }
        return array;
    }
}

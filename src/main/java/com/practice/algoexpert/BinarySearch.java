package com.practice.algoexpert;

public class BinarySearch {

    public static int binarySearch(int[] array, int target){
        int index = -1;
        int i = 0 , j = array.length-1;
        while(i <= j ){
            int mid = (i+j)/2;
            if(target == array[mid])
                return mid;
            if(target > array[mid])
                i = mid+1;
            else
                j = mid-1;
        }
        return index;
    }
}

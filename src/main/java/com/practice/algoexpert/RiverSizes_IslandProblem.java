package com.practice.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes_IslandProblem {


    public static Integer[] getRiverSizes(int[][] source){
        List<Integer> riverSizes = new ArrayList<>();
        for(int i = 0 ; i < source.length ; i++){
            for(int j = 0 ; j < source[i].length ; j++){
                if(source[i][j] == 1){
                    riverSizes.add(getConnectedRivers(source,i,j));
                }
            }
        }
        Integer[] result = new Integer[riverSizes.size()];
        return riverSizes.toArray(result);
    }

    private static Integer getConnectedRivers(int[][] source, int i, int j) {
        int count = 0;
        if(i < 0 || j < 0 || i >= source.length || j >= source[i].length)
            return count;
        if(source[i][j] == 1){
            source[i][j] = 0;
            count += 1;
            count += getConnectedRivers(source,i-1, j);
            count += getConnectedRivers(source,i+1,j);
            count += getConnectedRivers(source,i,j-1);
            count += getConnectedRivers(source,i,j+1);
        }

        return count;
    }
}

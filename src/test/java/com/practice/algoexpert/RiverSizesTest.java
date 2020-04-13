package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class RiverSizesTest {

    @Test
    public void test1(){
        int[][] source = {};
        Integer[] rivers  = RiverSizes_IslandProblem.getRiverSizes(source);
        assertTrue(rivers.length == 0);
    }

    @Test
    public void test2(){
        int[][] source = {{1,0,0,0,0},
                            {1,1,0,0,1},
                             {0,1,1,0,1}};
        Integer[] rivers  = RiverSizes_IslandProblem.getRiverSizes(source);
        assertTrue(rivers.length == 2);
    }

    @Test
    public void test3(){
        int[][] source = {{1,1,0,0,1},
            {0,1,1,0,1},
            {1,0,1,0,0},{1,1,0,1,1,}};
        Integer[] rivers  = RiverSizes_IslandProblem.getRiverSizes(source);
        assertTrue(rivers.length == 4);
    }
}

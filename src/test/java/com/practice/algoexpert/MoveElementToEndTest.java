package com.practice.algoexpert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.assertTrue;

import com.practice.algoexpert.arrays.MoveElementToEnd;
import org.junit.Test;

public class MoveElementToEndTest {

    @Test
    public void test1(){
        int[] source = {1,2,3,2,5,6,7,2,4,5,6,7,2,2,3,1};
        List<Integer> sourceList = Arrays.stream(source).boxed().collect(Collectors.toList());
        sourceList = MoveElementToEnd.moveElementToEnd(sourceList,2);
        int i = 0 ;
        for(; i < sourceList.size() && sourceList.get(i) != 2; i++){
        }
        for(int j = i ; j < sourceList.size();j++){
            assertTrue(sourceList.get(j) == 2);
        }
    }

    @Test
    public void test2(){
        int[] source = {2,2,2,2,2,2,2,2,2,2};
        List<Integer> sourceList = Arrays.stream(source).boxed().collect(Collectors.toList());
        sourceList = MoveElementToEnd.moveElementToEnd(sourceList,2);
        int i = 0 ;
        for(; i < sourceList.size() && sourceList.get(i) != 2; i++){
        }
        for(int j = i ; j < sourceList.size();j++){
            assertTrue(sourceList.get(j) == 2);
        }
    }

    @Test
    public void test3(){
        int[] source = {2,2,2,2,1,1,1,1,1,2,2,2};
        List<Integer> sourceList = Arrays.stream(source).boxed().collect(Collectors.toList());
        sourceList = MoveElementToEnd.moveElementToEnd(sourceList,2);
        int i = 0 ;
        for(; i < sourceList.size() && sourceList.get(i) != 2; i++){
        }
        for(int j = i ; j < sourceList.size();j++){
            assertTrue(sourceList.get(j) == 2);
        }
    }

    @Test
    public void test4(){
        int[] source = {5,5,7,8,9,4,1,1,1,1,1,0};
        List<Integer> sourceList = Arrays.stream(source).boxed().collect(Collectors.toList());
        sourceList = MoveElementToEnd.moveElementToEnd(sourceList,2);
        int i = 0 ;
        for(; i < sourceList.size() && sourceList.get(i) != 2; i++){
        }
        for(int j = i ; j < sourceList.size();j++){
            assertTrue(sourceList.get(j) == 2);
        }
    }
}

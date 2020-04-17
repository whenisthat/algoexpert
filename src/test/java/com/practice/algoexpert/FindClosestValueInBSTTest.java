package com.practice.algoexpert;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FindClosestValueInBSTTest {

    FindClosestValueInBST.BST root;

    @Before
    public void setup(){
        root = BSTBuilder.insert(5);
        BSTBuilder.insert(15);
        BSTBuilder.insert(5);
        BSTBuilder.insert(2);
        BSTBuilder.insert(1);
        BSTBuilder.insert(22);
        BSTBuilder.insert(1);
        BSTBuilder.insert(1);
        BSTBuilder.insert(3);
        BSTBuilder.insert(1);
        BSTBuilder.insert(1);
        BSTBuilder.insert(502);
        BSTBuilder.insert(55000);
        BSTBuilder.insert(204);
        BSTBuilder.insert(205);
        BSTBuilder.insert(207);
        BSTBuilder.insert(206);
        BSTBuilder.insert(208);
        BSTBuilder.insert(203);
        BSTBuilder.insert(-51);
        BSTBuilder.insert(-403);
        BSTBuilder.insert(1001);
        BSTBuilder.insert(57);
        BSTBuilder.insert(60);
        BSTBuilder.insert(4500);

    }

    @Test
    public void test1(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,4501);
        Assert.assertTrue(value == 4500);
    }

    @Test
    public void test3(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,208);
        Assert.assertTrue(value == 208);
    }

    @Test
    public void test4(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,4500);
        Assert.assertTrue(value == 4500);
    }

    @Test
    public void test5(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,-70);
        Assert.assertTrue(value == -51);
    }

    @Test
    public void test6(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,2000);
        Assert.assertTrue(value == 1001);
    }

    @Test
    public void test7(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,6);
        Assert.assertTrue(value == 5);
    }

    @Test
    public void test8(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,30000);
        Assert.assertTrue(value == 55000);
    }

    @Test
    public void test9(){
        int value = FindClosestValueInBST.findClosestValueInBst(root,-1);
        Assert.assertTrue(value == 1);
    }

}

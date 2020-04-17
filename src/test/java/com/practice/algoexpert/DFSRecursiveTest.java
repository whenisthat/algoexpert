package com.practice.algoexpert;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class DFSRecursiveTest {

    @Test
    public void test1(){

        DFSRecursive.Node nodeA = new DFSRecursive.Node("A");

        DFSRecursive.Node nodeB = new DFSRecursive.Node("B");
        DFSRecursive.Node nodeC = new DFSRecursive.Node("C");
        DFSRecursive.Node nodeD = new DFSRecursive.Node("D");

        nodeA.children = Arrays.asList(nodeB,nodeC,nodeD);

        DFSRecursive.Node nodeE= new DFSRecursive.Node("E");
        DFSRecursive.Node nodeF = new DFSRecursive.Node("F");
        nodeB.children = Arrays.asList(nodeE,nodeF);

        DFSRecursive.Node nodeG = new DFSRecursive.Node("G");
        DFSRecursive.Node nodeH = new DFSRecursive.Node("H");

        nodeD.children = Arrays.asList(nodeG,nodeH);

        List<String> result = DFSRecursive.depthFirstSearch(nodeE);
        assertTrue(result.size() == 1);

        result = DFSRecursive.depthFirstSearch(nodeB);
        assertTrue(result.size() == 3);
        assertTrue(result.get(0) == "B");
        assertTrue(result.get(1) == "E");
        assertTrue(result.get(2) == "F");

        result = DFSRecursive.depthFirstSearch(nodeA);
        assertTrue(result.size() == 8);
        assertTrue(result.get(0) == "A");
        assertTrue(result.get(1) == "B");

        assertTrue(result.get(2) == "E");
        assertTrue(result.get(3) == "F");
        assertTrue(result.get(4) == "C");
        assertTrue(result.get(6) == "G");


    }
}

package com.practice.algoexpert;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSRecursive {

    public static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static List<String> depthFirstSearch(Node node) {
        List<String> result = new ArrayList<>();
        if(node != null){
            result.add(node.name);
            List<Node> children = node.children;
            for(Node n : children){
                List<String> tempResult = depthFirstSearch(n);
                result.addAll(tempResult);
            }
        }

        return result;
    }
}

package com.practice.algoexpert;

import java.util.HashSet;
import java.util.Set;

public class LinkedListLoopCheck {

    public static LinkedListNode<Integer> doesLoopExists(LinkedListNode<Integer> node){
        boolean doesLoopExists = false;
        Set<LinkedListNode> set = new HashSet<>();
        while(!doesLoopExists && node != null){
            set.add(node);
            LinkedListNode next = node.getNext();
            node = next;
            if(node != null){
                LinkedListNode n = node.getNext();
                if(set.contains(n)) {
                    doesLoopExists = true;
                    return n;
                }
            }
        }
        return null;
    }
}

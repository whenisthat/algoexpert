package com.practice.algoexpert;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListLoopCheckTest {

    @Test
    public void test1(){
        LinkedListNode<Integer> node1 = new LinkedListNode<>(1);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(2);
        node1.setNext(node2);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(3);
        node2.setNext(node3);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(4);
        node3.setNext(node4);
        LinkedListNode<Integer> node5 = new LinkedListNode<>(5);
        node4.setNext(node5);
        LinkedListNode<Integer> node6 = new LinkedListNode<>(6);
        node5.setNext(node6);
        LinkedListNode<Integer> node7 = new LinkedListNode<>(7);
        node6.setNext(node7);
        LinkedListNode<Integer> node8 = new LinkedListNode<>(8);
        node7.setNext(node8);
        LinkedListNode<Integer> node9 = new LinkedListNode<>(9);
        node8.setNext(node9);
        LinkedListNode<Integer> node10 = new LinkedListNode<>(10);
        node9.setNext(node10);
        LinkedListNode result = LinkedListLoopCheck.doesLoopExists(node1);
        assertNull(result);
    }

    @Test
    public void test2(){
        LinkedListNode<Integer> node1 = new LinkedListNode<>(1);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(2);
        node1.setNext(node2);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(3);
        node2.setNext(node3);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(4);
        node3.setNext(node4);
        LinkedListNode<Integer> node5 = new LinkedListNode<>(5);
        node4.setNext(node5);
        LinkedListNode<Integer> node6 = new LinkedListNode<>(6);
        node5.setNext(node6);
        LinkedListNode<Integer> node7 = new LinkedListNode<>(7);
        node6.setNext(node2);
        LinkedListNode<Integer> node8 = new LinkedListNode<>(8);
        node7.setNext(node8);
        LinkedListNode<Integer> node9 = new LinkedListNode<>(9);
        node8.setNext(node9);
        LinkedListNode<Integer> node10 = new LinkedListNode<>(10);
        node9.setNext(node10);
        LinkedListNode result = LinkedListLoopCheck.doesLoopExists(node1);
        assertNotNull(result);
        assertTrue(node2 == result);
    }


    @Test
    public void test3(){
        LinkedListNode<Integer> node1 = new LinkedListNode<>(1);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(2);
        node1.setNext(node2);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(3);
        node2.setNext(node3);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(2);
        node3.setNext(node4);
        LinkedListNode<Integer> node5 = new LinkedListNode<>(5);
        node4.setNext(node5);
        LinkedListNode result = LinkedListLoopCheck.doesLoopExists(node1);
        assertNull(result);
    }

    @Test
    public void test4(){
        LinkedListNode result = LinkedListLoopCheck.doesLoopExists(null);
        assertNull(result);
    }
}

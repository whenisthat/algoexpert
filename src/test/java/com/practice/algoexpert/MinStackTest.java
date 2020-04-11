package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinStackTest {

    @Test
    public void test1(){
        MinStack.push(4);
        int min = MinStack.getMin();
        assertEquals(min,4);
        MinStack.push(5);
        min = MinStack.getMin();
        assertEquals(min,4);
        MinStack.push(3);
        min = MinStack.getMin();
        assertEquals(min,3);
        int peek = MinStack.peek();
        assertEquals( peek,3);
        MinStack.push(9);
        min = MinStack.getMin();
        assertEquals(min,3);
        peek = MinStack.peek();
        assertEquals( peek,9);
        MinStack.pop();
        peek = MinStack.peek();
        assertEquals( peek,3);
        MinStack.push(1);
        min = MinStack.getMin();
        assertEquals(min,1);
        MinStack.push(-1);
        min = MinStack.getMin();
        assertEquals(min,-1);
        peek = MinStack.peek();
        assertEquals( peek,-1);
    }
}

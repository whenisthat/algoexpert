package com.practice.algoexpert;

import java.util.Stack;

public class MinStack {

    private static Stack<Integer> stack = new Stack();
    static int min = Integer.MAX_VALUE;

    public static void push(int value){
       if(stack.isEmpty()) {
           stack.push(value);
           min = value < min ? value : min;
       }else{
            if(value >= min)
                stack.push(value);
            else{
                stack.push(2*value-min);
                min = value;
            }
       }
    }

    public static int getMin(){
        return min;
    }

    public static int peek(){
        int peek = stack.peek();
        peek = peek >= min ? peek : min;
        return peek;
    }

    public static void pop(){
        int pop = stack.pop();
        min = pop >= min ? min : 2*min-pop;
    }
}

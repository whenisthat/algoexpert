package com.practice.algoexpert;

public class NthFibonacci {

    public static int getNthFibonacci(int n){
        int nthFib = 0;
        int a = 0, b = 1;
        nthFib = n == 1 ?  a : n == 2 ? b : 0 ;
        for(int i = 2 ; i < n ; i++){
            nthFib = a+b;
            a = b;
            b = nthFib;
        }
        return nthFib;
    }
}

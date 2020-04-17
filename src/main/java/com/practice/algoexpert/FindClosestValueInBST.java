package com.practice.algoexpert;



import java.util.Stack;

/*Write a function that takes in a Binary Search Tree (BST) and a target integer
    value and returns the closest value to that target value contained in the BST.*/
public class FindClosestValueInBST {

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static int findClosestValueInBst(BST tree, int target){

        int closestValue = tree.value;
        tree = closestValue > target ? tree.left : tree.right;
        while(tree != null){
            int value = tree.value;
            if(value == target)
                return value;
            int a = Math.abs(closestValue-target);
            int b = Math.abs(target-value);
            closestValue = a > b ? value : closestValue;
            tree = value > target ? tree.left : tree.right;
        }
        return closestValue;
    }
}

package com.practice.algoexpert;

public class BSTBuilder {

   static  FindClosestValueInBST.BST root = null;

    public static FindClosestValueInBST.BST insert(int value){
        if(root == null) {
            root = new FindClosestValueInBST.BST(value);
            return root;
        }
        FindClosestValueInBST.BST temp = root;
        while(temp != null){
            if(temp.value >= value){
                if(temp.left == null){
                    temp.left = new FindClosestValueInBST.BST(value);
                    return root;
                }else{
                    temp = temp.left;
                }

            }else{
                if(temp.right == null){
                    temp.right = new FindClosestValueInBST.BST(value);
                    return root;
                }else{
                    temp = temp.right;
                }
            }
        }

        return root;
    }
}

package com.DSA.Trees;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int val) {
        this.val = val;
    }
}
public class MainTreeClass {
    public static void main(String[] args) {
        TreeNode1 node = new TreeNode1(1);
        node.left = new TreeNode1(2);
        node.right = new TreeNode1(3);

        node.left.left = new TreeNode1(4);
        node.left.right = new TreeNode1(5);
    }
}

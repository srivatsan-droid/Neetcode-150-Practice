package com.DSA.Trees;

public class CountGoodNodes {
    public static int goodNodes(TreeNode root) {
        return  helper(root,Integer.MIN_VALUE);
    }
    private static int helper(TreeNode root,int max) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        if(root.val >= max) {
            count++;
        }
        max = Math.max(max,root.val);
        count += helper(root.left,max);
        count += helper(root.right,max);
        return count;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);

        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(goodNodes(root));
    }
}

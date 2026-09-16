package com.DSA.Trees;

public class BalancedTree {
    public static boolean isBalanced(TreeNode root) {
        return Dfs(root) != -1;
    }
    private static int Dfs(TreeNode root) {
        if(root == null)
            return -1;
        int leftHeight = Dfs(root.left);
        if(leftHeight == -1) {
            return -1;
        }
        int rightHeight = Dfs(root.right);
        if(rightHeight == -1) {
            return -1;
        }
        if(Math.abs(leftHeight -rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println(isBalanced(root1)); // true


        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);

        System.out.println(isBalanced(root2)); // false


        // Example 3 - Empty tree
        TreeNode root3 = null;

        System.out.println(isBalanced(root3)); // true
    }
}

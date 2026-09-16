package com.DSA.Trees;

public class DiameterOfTree {
    static int maxDiameter = 0;
    public static int diameterFind(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lHeight = diameterFind(root.left);
        int rHeight = diameterFind(root.right);
        if(lHeight + rHeight > maxDiameter) {
            maxDiameter = lHeight + rHeight;
        }
        return 1 + Math.max(lHeight,rHeight);
    }
    public static int diameter(TreeNode root) {
        maxDiameter = 0;
        diameterFind(root);
        return maxDiameter;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameter(root));
    }
}

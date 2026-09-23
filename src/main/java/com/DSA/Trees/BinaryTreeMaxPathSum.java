package com.DSA.Trees;

public class BinaryTreeMaxPathSum {

    static int ans;

    public static int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        DFS(root);
        return ans;
    }

    private static int DFS(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftGain = DFS(root.left);
        int rightGain = DFS(root.right);

        leftGain = Math.max(0, leftGain);
        rightGain = Math.max(0, rightGain);

        int currentPath = leftGain + root.val + rightGain;

        ans = Math.max(ans, currentPath);

        return root.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = maxPathSum(root);

        System.out.println(result);
    }
}
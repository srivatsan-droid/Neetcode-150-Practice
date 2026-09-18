
package com.DSA.Trees;

public class ValidateBinaryTree {

    public static boolean isValidBST(TreeNode root) {
        return isHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isHelper(TreeNode root, long min, long max) {

        // Base case: empty subtree is valid
        if (root == null) {
            return true;
        }

        // Check if current node violates its allowed range
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // Validate both left and right subtrees
        return isHelper(root.left, min, root.val)
                && isHelper(root.right, root.val, max);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root)); // true
    }
}
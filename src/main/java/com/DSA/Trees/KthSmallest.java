package com.DSA.Trees;

public class KthSmallest {
    static int count = 0;
    static int ans = 0;
    public static int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }
    private static void helper(TreeNode root,int k) {
        if(root == null)
            return;
        helper(root.left,k);
        count++;
        if(count == k) {
            ans = root.val;
            return;
        }
        if(count < k) {
            helper(root.right,k);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        int ans = kthSmallest(root,k);
        System.out.println(ans);
    }
}

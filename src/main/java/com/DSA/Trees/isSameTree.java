package com.DSA.Trees;

public class isSameTree {
    public static boolean isSame(TreeNode p,TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q ==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        boolean left = isSame(p.left,q.left);
        boolean right = isSame(p.right,q.right);
        return left && right;
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean ans = isSame(p,q);
        System.out.println(ans);
    }
}

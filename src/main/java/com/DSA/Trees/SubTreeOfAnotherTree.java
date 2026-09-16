package com.DSA.Trees;

public class SubTreeOfAnotherTree {
    public static boolean isSubTree(TreeNode root,TreeNode subRoot) {
        if(root == null)
            return false;
        if(isSameTree(root,subRoot))
            return true;
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }
    public static boolean isSameTree(TreeNode p,TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        boolean isleft = isSameTree(p.left,q.left);
        boolean isRight = isSameTree(p.right,q.right);
        return isleft && isRight;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subTree = new TreeNode(4);
        subTree.left = new TreeNode(1);
        subTree.right = new TreeNode(2);

        boolean ans = isSubTree(root,subTree);
        System.out.println(ans);
    }
}

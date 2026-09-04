package com.DSA.Trees;

import java.util.*;

public class PreOrderTraveral {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root,ans);
        return ans;
    }
    private static void preOrder(TreeNode root,List<Integer> ans) {
        if(root == null) {
            return;
        }
        ans.add(root.val);
        preOrder(root.left,ans);
        preOrder(root.right,ans);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InOrder obj = new InOrder();

        List<Integer> result = preorderTraversal(root);
        System.out.println(result);
    }
}

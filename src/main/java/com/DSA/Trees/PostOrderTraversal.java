package com.DSA.Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrderTraversal(root,ans);
        return ans;
    }
    private static void postOrderTraversal(TreeNode root,List<Integer> ans) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left,ans);
        postOrderTraversal(root.right,ans);
        ans.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = postOrderTraversal(root);
        System.out.println(result);
    }
}

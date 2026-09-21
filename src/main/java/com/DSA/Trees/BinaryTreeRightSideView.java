package com.DSA.Trees;

import java.util.*;

public class BinaryTreeRightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root,0,result);
        return result;
    }
    private static void dfs(TreeNode root,int depth,List<Integer> result) {
        if(root == null)
            return;
        if(depth == result.size()) {
            result.add(root.val);
        }
        dfs(root.right,depth+1,result);
        dfs(root.left,depth+1,result);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        List<Integer> result = rightSideView(root);
        for(int i = 0;i < result.size();i++) {
            System.out.println(result.get(i) + " ");
        }
    }
}

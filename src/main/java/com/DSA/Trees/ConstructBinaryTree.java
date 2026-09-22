package com.DSA.Trees;

import java.util.*;

public class ConstructBinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return buildTree(
                preorder,
                0,
                preorder.length - 1,
                inorder,
                0,
                inorder.length - 1,
                inMap
        );
    }
    public static TreeNode buildTree(
            int[] preorder,
            int preStart,
            int preEnd,
            int[] inorder,
            int inStart,
            int inEnd,
            Map<Integer, Integer> inMap
    ) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preStart];

        TreeNode root = new TreeNode(rootValue);

        int inRoot = inMap.get(rootValue);

        int numsLeft = inRoot - inStart;

        root.left = buildTree(
                preorder,
                preStart + 1,
                preStart + numsLeft,
                inorder,
                inStart,
                inRoot - 1,
                inMap
        );

        root.right = buildTree(
                preorder,
                preStart + numsLeft + 1,
                preEnd,
                inorder,
                inRoot + 1,
                inEnd,
                inMap
        );

        return root;
    }
    public static void main(String[] args) {

        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        ConstructBinaryTree tree = new ConstructBinaryTree();

        TreeNode root = tree.buildTree(preOrder, inOrder);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(current.val + " ");

            queue.offer(current.left);
            queue.offer(current.right);
        }
    }
}

package com.DSA.Trees;

public class SerializeDeserializeTree {

    public static String serialize(TreeNode root) {

        if (root == null) {
            return "null";
        }

        StringBuilder result = new StringBuilder();

        serializeHelper(root, result);

        return result.toString();
    }

    private static void serializeHelper(TreeNode root, StringBuilder result) {

        if (root == null) {
            result.append("null,");
            return;
        }

        result.append(root.val).append(",");

        serializeHelper(root.left, result);
        serializeHelper(root.right, result);
    }

    // Index used while deserializing
    static int index = 0;

    public static TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] values = data.split(",");

        index = 0;

        return deserializeHelper(values);
    }

    private static TreeNode deserializeHelper(String[] values) {

        String value = values[index++];

        if (value.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value));

        root.left = deserializeHelper(values);

        root.right = deserializeHelper(values);

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Serialize
        String data = serialize(root);

        System.out.println("Serialized: " + data);

        // Deserialize
        TreeNode newRoot = deserialize(data);

        System.out.println("Deserialized Tree:");

        preorder(newRoot);
    }

    public static void preorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }
}
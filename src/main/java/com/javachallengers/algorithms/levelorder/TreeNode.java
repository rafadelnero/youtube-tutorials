package com.javachallengers.algorithms.levelorder;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    /**
     *         3
     *        / \
     *       9  20
     *         /  \
     *        15   7
     */
    static TreeNode getSimpleTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    /**
     *             10
     *           /    \
     *         5       20
     *        / \     /   \
     *       3   8   15    25
     *      /     \    \   / \
     *     1       9   17 22  30
     */
    static TreeNode getComplexTree() {
        // Example usage with a more complicated binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);

        // Adding more nodes to the left subtree
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.left.right.right = new TreeNode(9);

        // Adding more nodes to the right subtree
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);
        root.right.left.right = new TreeNode(17);
        root.right.right.right = new TreeNode(30);
        root.right.right.left = new TreeNode(22);

        return root;
    }
}
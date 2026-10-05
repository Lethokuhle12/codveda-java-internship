package com.example.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private TreeNode root;

    // ---------- INSERT ----------
    public void insert(int value) {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);
        if (value < node.data) node.left = insert(node.left, value);
        else if (value > node.data) node.right = insert(node.right, value);
        // duplicates are ignored
        return node;
    }

    // ---------- SEARCH ----------
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(TreeNode node, int value) {
        if (node == null) return false;
        if (value == node.data) return true;
        return value < node.data ? search(node.left, value) : search(node.right, value);
    }

    // ---------- DELETE ----------
    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode node, int value) {
        if (node == null) return null;

        if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {
            // Zero or one child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Two children: replace with smallest value in the right subtree
            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    private int minValue(TreeNode node) {
        while (node.left != null) node = node.left;
        return node.data;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // ---------- TRAVERSALS ----------
    public List<Integer> inOrder() {          // Left, Root, Right
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        inOrder(node.left, out);
        out.add(node.data);
        inOrder(node.right, out);
    }

    public List<Integer> preOrder() {         // Root, Left, Right
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        out.add(node.data);
        preOrder(node.left, out);
        preOrder(node.right, out);
    }

    public List<Integer> postOrder() {        // Left, Right, Root
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        postOrder(node.left, out);
        postOrder(node.right, out);
        out.add(node.data);
    }
}

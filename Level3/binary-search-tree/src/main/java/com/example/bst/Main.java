package com.example.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            bst.insert(v);
        }

        System.out.println("In-order:   " + bst.inOrder());
        System.out.println("Pre-order:  " + bst.preOrder());
        System.out.println("Post-order: " + bst.postOrder());

        System.out.println("Search 60: " + bst.search(60));
        System.out.println("Search 99: " + bst.search(99));

        bst.delete(20);   // leaf
        bst.delete(30);   // one child
        bst.delete(50);   // two children (root)

        System.out.println("In-order after deletions: " + bst.inOrder());
    }
}

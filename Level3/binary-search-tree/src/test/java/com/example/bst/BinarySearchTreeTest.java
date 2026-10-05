package com.example.bst;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @BeforeEach
    void setUp() {
        bst = new BinarySearchTree();
        for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) bst.insert(v);
    }

    @Test
    void traversals() {
        assertEquals(List.of(20, 30, 40, 50, 60, 70, 80), bst.inOrder());
        assertEquals(List.of(50, 30, 20, 40, 70, 60, 80), bst.preOrder());
        assertEquals(List.of(20, 40, 30, 60, 80, 70, 50), bst.postOrder());
    }

    @Test
    void search() {
        assertTrue(bst.search(60));
        assertFalse(bst.search(99));
    }

    @Test
    void insertIgnoresDuplicates() {
        bst.insert(50);
        assertEquals(7, bst.inOrder().size());
    }

    @Test
    void deleteLeaf() {
        bst.delete(20);
        assertEquals(List.of(30, 40, 50, 60, 70, 80), bst.inOrder());
    }

    @Test
    void deleteNodeWithOneChild() {
        bst.delete(20);
        bst.delete(30);
        assertEquals(List.of(40, 50, 60, 70, 80), bst.inOrder());
    }

    @Test
    void deleteNodeWithTwoChildren() {
        bst.delete(50);
        assertEquals(List.of(20, 30, 40, 60, 70, 80), bst.inOrder());
        assertFalse(bst.search(50));
    }

    @Test
    void deleteMissingValueDoesNothing() {
        bst.delete(999);
        assertEquals(7, bst.inOrder().size());
    }
}

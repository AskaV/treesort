package com.Tanda;

import java.util.ArrayList;

public class MyNode {

    private MyNode left;
    private MyNode right;
    private int key;

    public MyNode(int key) {
        this.key = key;
    }

    public void deep(MyNode node, ArrayList<Integer> SortMass) {
        if (left != null) {
            left.deep(this, SortMass); //this та же нода только глубже
        }
        SortMass.add(key);

        if (right != null) {
            right.deep(this, SortMass);
        }
    }

    public void insert(MyNode node) {
        if (node.key < key) {
            if (left != null) {
                left.insert(node);
            } else {
                left = node;
            }
        } else {
            if (right != null) {
                right.insert(node);
            } else {
                right = node;
            }
        }
    }

}

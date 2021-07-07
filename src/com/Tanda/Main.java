package com.Tanda;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Двоичным(бинарным) деревом назовем упорядоченную структуру данных,
 * в которой каждому элементу - предшественнику или корню (под)дерева -
 * поставлены в соответствие по крайней мере два других элемента (преемника).
 */
public class Main {
    public static void main(String[] args) {
        int[] unsMass = new int[]{20, 1, 19, 1, -77, 10, 8, 4, 16, 12, -7, 3, 06, 12, 13, -17, 9, 5, 2, 54, 101};
        //int[] unsMass = new int[]{1};
        //int[] unsMass = new int[]{};
        ArrayList<Integer> SortMass = new ArrayList<>();
        if (unsMass.length == 0) {
            System.out.print("Empty array");
            return;
        }
        System.out.print("Unsorted mass " + Arrays.toString(unsMass));

        MyNode myNode = new MyNode(unsMass[0]);
        for (int i = 1; i < unsMass.length; i++) {
            myNode.insert(new MyNode(unsMass[i]));
        }
        myNode.deep(myNode, SortMass);
        System.out.print("\nSorted mass " + Arrays.toString(SortMass.toArray()));
    }
}

package org.gdstruc.module6;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        System.out.println("In Order:");
        tree.traverseInOrder();

        System.out.println("==========================");

        // traverse the tree (Descending Order)
        System.out.println("Descending Order:");
        tree.traverseInOrderDescending();

        System.out.println("==========================");

        // retrieves the node with the least value in the tree
        System.out.println("Lowest value: " + tree.getMin());

        System.out.println("Largest value: " +  tree.getMax());

        // search a node by value
        //System.out.println(tree.get(1000));
    }
}
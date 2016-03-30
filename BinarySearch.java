/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Mr.keroles
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] data = {23, 17, 5, 90, 12, 44, 38, 84, 77, 3, 66, 55, 1, 19, 37, 88, 8, 97, 25, 50, 75, 61, 49};
        BinaryTree tree = new BinaryTree();
        BinaryHeap<Integer> heap = new BinaryHeap<Integer>();

        for (int item : data) {
            tree.insert(item);
            heap.insert(item);
        }
        System.out.println("Binary Tree \n");
        tree.printBinaryTree();
        System.out.println("\n Post order : ");
        tree.postorder();
        System.out.println("\n Pre order : ");
        tree.preorder();
        System.out.println("\n In order : ");
        tree.inorder();
        System.out.println("\n .....................................................................");
        heap.heapSort(data);
        System.out.println(Arrays.toString(data));

        heap.PheapTree();
    }

}

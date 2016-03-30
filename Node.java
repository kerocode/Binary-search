/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Mr.keroles
 */
public class Node {

    Node leftChild;
    Node rightChild;
    int data;

    /* Constructor */
    public Node() {
        leftChild = null;
        rightChild = null;
        data = 0;
    }
    /* Constructor */

    public Node(int n) {
        leftChild = null;
        rightChild = null;
        data = n;
    }
    /* Function to set leftChild node */

    public void setLeft(Node n) {
        leftChild = n;
    }
    /* Function to set rightChild node */

    public void setRight(Node n) {
        rightChild = n;
    }
    /* Function to get leftChild node */

    public Node getLeft() {
        return leftChild;
    }
    /* Function to get rightChild node */

    public Node getRight() {
        return rightChild;
    }
    /* Function to set data to node */

    public void setData(int d) {
        data = d;
    }
    /* Function to get data from node */

    public int getData() {
        return data;
    }
}

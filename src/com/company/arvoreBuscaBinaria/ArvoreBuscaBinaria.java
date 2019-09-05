package com.company.arvoreBuscaBinaria;

public class ArvoreBuscaBinaria {

    private Node root;

    public class Node{
        private Node left;

        private Node right;
        private int value;
        private Node(int value) {
            this.value = value;
        }

        private void insert(Node node) {
            if (node.value >this.value){
                if (right == null){
                    this.right = node;
                }else {
                    this.right.insert(node);
                }
            } else if (node.value < this.value) {
                if (this.left == null) {
                    this.left = node;
                } else {
                    this.left.insert(node);
                }
            }
        }

        private Node search(int i) {
            if (i == this.value){
                return this;
            }
            if (i < this.value){
                if (left == null){
                    return null;
                } else {
                    return left.search(i);
                }
            }
            else {
                if (right == null){
                    return null;
                } else {
                    return right.search(i);
                }
            }
        }
    }


    public ArvoreBuscaBinaria() {
    }

    public ArvoreBuscaBinaria(int value) {
        root = new Node(value);
    }

    public Node search(int i) {
        if (root == null){
            return null;
        }
        return root.search(i);
    }

    public void insert(Node node){
        if (root == null){
            root = node;
            return;
        }
        root.insert(node);
    }

    public void insert(int value){
        Node n = new Node(value);
        insert(n);
    }
}

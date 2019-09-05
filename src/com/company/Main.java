package com.company;

import com.company.arvoreBuscaBinaria.ArvoreBuscaBinaria;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
        tree.insert(10);
        tree.insert(100);
        tree.insert(200);
        tree.insert(200);
        tree.insert(30);
        ArvoreBuscaBinaria.Node value = tree.search(30);

        if (value != null){
            System.out.println("Encontrou o elemento");
        } else {
            System.out.println("Não encontrou essa porra.");
        }

    }
}

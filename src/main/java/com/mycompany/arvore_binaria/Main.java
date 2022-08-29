/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_binaria;

/**
 *
 * @author vinyj
 */
public class Main {
    public static void main(String[] args) {
        //Geração de nós
        No noRaiz = new No(14);
        No no4 = new No(4);
        No no3 = new No(3);
        No no9 = new No(9);
        No no7 = new No(7);
        No no5 = new No(5);
        No no15 = new No(15);
        No no18 = new No(18);
        No no16 = new No(16);
        No no20 = new No(20);
        No no17 = new No(17);
       
        //Adição de filhos aos nós
        noRaiz.adicionarFilhoEsqAoNo(no4);
        noRaiz.adicionarFilhoDirAoNo(no15);

        no4.adicionarFilhoEsqAoNo(no3);
        no4.adicionarFilhoDirAoNo(no9);
        
        no9.adicionarFilhoEsqAoNo(no7);
        
        no7.adicionarFilhoDirAoNo(no5);
        
        no15.adicionarFilhoDirAoNo(no18);
        
        no18.adicionarFilhoEsqAoNo(no16);
        no18.adicionarFilhoDirAoNo(no20);

        no16.adicionarFilhoDirAoNo(no17);
        
        Arvore arvore = new Arvore(noRaiz);
        
        //Print das informações sobre a árvore
        System.out.println("Altura do nó:");
        
        System.out.println("Altura da árvore:");
        
        System.out.println("Profundidade do nó:");
        
        System.out.println("Profundidade da árvore:");
        
        System.out.println("Grau do nó:");
        
        System.out.println("Grau da árvore:");
        
        System.out.println("Elementos: ");
        arvore.getElementos();
        
        System.out.println("Nós folhas:");
        arvore.getNoFolha();
        
        System.out.println("Nós Internos:");
        arvore.getNoInterno();
        
        System.out.println("Árvore Genérica:");
        arvore.printArvore(noRaiz); 
    }       
}



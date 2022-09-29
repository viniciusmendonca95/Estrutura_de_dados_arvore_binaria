/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_binaria;

/**
 * @author vinyj
 */
public class Main {
    public static void main(String[] args) {
        //Criação do Nó Raiz
        No noRaiz = new No(50);
        
        //Geração da árvore binária de busca
        Arvore arvore = new Arvore();
        
        //Inserção dos nós na árvore
        arvore.setNoRaiz(noRaiz);
        arvore.inserirNoNaArvore(30);
        arvore.inserirNoNaArvore(40);
        arvore.inserirNoNaArvore(48);
        arvore.inserirNoNaArvore(35);
        arvore.inserirNoNaArvore(65);
        arvore.inserirNoNaArvore(75);

        //arvore.removerNoArvore(35);
        //arvore.removerNoArvore(40);

        //Print das informações sobre a árvore
        System.out.println("\nAltura do nó:");
        arvore.mostraAlturaNo();

        System.out.println("\nAltura da árvore:");
        arvore.getAlturaArvore();

        System.out.println("\nProfundidade do nó:");
        arvore.getProfundidadeNo();

        System.out.println("\nProfundidade da árvore:");
        arvore.getProfundidadeArvore();

        System.out.println("\nGrau do nó:");
        noRaiz.getGrau();
        
        System.out.println("\nGrau da árvore:");
        arvore.getGrauArvore();
        
        System.out.println("\nElementos: ");
        arvore.getElementos();

        System.out.println("\nNós folhas:");
        arvore.getNoFolha();

        System.out.println("\nNós Internos:");
        arvore.getNoInterno();

        System.out.println("\nÁrvore Genérica:");
        arvore.printArvore(noRaiz);
    }
}

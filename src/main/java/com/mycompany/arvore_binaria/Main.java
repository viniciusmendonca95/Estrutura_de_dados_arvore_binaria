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
        No noRaiz = new No(8);
        
        //Geração da árvore binária de busca
        Arvore arvore = new Arvore();
        
        //Inserção dos nós na árvore
        arvore.setNoRaiz(noRaiz);
        arvore.inserirNoNaArvore(3);
        arvore.inserirNoNaArvore(10);
        arvore.inserirNoNaArvore(1);
        arvore.inserirNoNaArvore(6);
        arvore.inserirNoNaArvore(14);
        arvore.inserirNoNaArvore(4);
        arvore.inserirNoNaArvore(7);
        arvore.inserirNoNaArvore(13);
        
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

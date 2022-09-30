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
        No noRaiz = new No(40);
        
        //Geração da árvore binária de busca
        Arvore arvore = new Arvore();
        
        //Inserção dos nós na árvore
        arvore.setNoRaiz(noRaiz);
        arvore.inserirNoNaArvore(30);
        arvore.inserirNoNaArvore(35);
        arvore.inserirNoNaArvore(38);
        arvore.inserirNoNaArvore(25);
        arvore.inserirNoNaArvore(28);
        arvore.inserirNoNaArvore(26);
        arvore.inserirNoNaArvore(65);
        arvore.inserirNoNaArvore(75);

        arvore.removerNoArvore(30);
//        arvore.removerNoArvore(40);

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
        arvore.getGrauNos();
        
        System.out.println("\nGrau da árvore:");
        System.out.println(arvore.getGrauArvore());
        
        System.out.println("\nElementos: ");
        arvore.getElementos();

        System.out.println("\nNós folhas:");
        arvore.getNoFolha();

        System.out.println("\nNós Internos:");
        arvore.getNoInterno();

        System.out.println("\nÁrvore Binária de Busca:");
        arvore.printArvore(arvore.getNoRaiz());
    }
}

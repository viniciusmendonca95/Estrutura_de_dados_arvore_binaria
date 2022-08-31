/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_binaria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinyj
 */
public class Arvore {
    //Atributos da árvore binária
    private No noRaiz;
    private List<No> elementos;

    //Construtor da árvore binária
    public Arvore(No no) {
        this.noRaiz = no;
        this.elementos = new ArrayList<>();
    }

    //Método que retorna o nó raiz da árvore
    public No getNoRaiz() {
        return noRaiz;
    }

    //Método que gera e retorna a lista de elementos da árvore
    public List<No> geraElementos(No no) {
        if (no.getNivelNo() == 0) {
            elementos.add(no);
        }

        while (true) {
            if (no.getFilhoEsqNo() != null) {
                elementos.add(no.getFilhoEsqNo());
                geraElementos(no.getFilhoEsqNo());
            }
            if (no.getFilhoDirNo() != null) {
                elementos.add(no.getFilhoDirNo());
                geraElementos(no.getFilhoDirNo());
            }

            break;
        }

        return this.elementos;
    }

    //Método que printa os a lista de elementos gerada
    public void getElementos() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        for (No elemento : elementos) {
            System.out.print(elemento.getValorNo() + "  ");
        }
        System.out.println();
    }

    //Método que retorna os nós folhas da árvore
    public void getNoFolha() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        List<No> nosFolhas = new ArrayList<>();

        for (No elemento : elementos) {
            if (elemento.getFilhoEsqNo() == null && elemento.getFilhoDirNo() == null) {
                nosFolhas.add(elemento);
            }
        }

        for (No noFolha : nosFolhas) {
            System.out.print(noFolha.getValorNo() + "  ");
        }
        System.out.println();
    }

    //Método que retorna os nós internos da árvore
    public void getNoInterno() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        List<No> nosInternos = new ArrayList<>();

        for (No elemento : elementos) {
            if (elemento.getFilhoEsqNo() != null || elemento.getFilhoDirNo() != null) {
                nosInternos.add(elemento);
            }
        }

        for (No noInterno : nosInternos) {
            System.out.print(noInterno.getValorNo() + "  ");
        }
        System.out.println();
    }

    //Método que retorna a altura da árvore
    public void getAlturaArvore() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        int altura = 0;

        for (No elemento : elementos) {
            if (elemento.getNivelNo() > altura) {
                altura = elemento.getNivelNo();
            }
        }

        System.out.println(altura);
    }

    //Método que retorna a altura de cada nó da árvore
    public void mostraAlturaNo() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        for (No elemento : elementos) {
            System.out.println("Nó: " + elemento.getValorNo() + "  Altura: " + getAlturaNo(elemento));
        }
    }

    private Integer getAlturaNo(No no) {
        if (no == null) {
            return -1;
        }
        return 1 + Math.max(getAlturaNo(no.getFilhoEsqNo()), getAlturaNo(no.getFilhoDirNo()));
    }

    //Método que retorna a profundidade da árvore
    public void getProfundidadeArvore() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        int profundidade = 0;

        for (No elemento : elementos) {
            if (elemento.getNivelNo() > profundidade) {
                profundidade = elemento.getNivelNo();
            }
        }

        System.out.println(profundidade);
    }

    //Método que retorna a profundidade de cada nó da árvore
    public void getProfundidadeNo() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        for (No elemento : elementos) {
            System.out.println("Nó " + elemento.getValorNo() + " tem profundidade " + elemento.getNivelNo());
        }
    }

    //Método que printa a árvore de forma identada    
    public void printArvore(No no) {
        String spaces = "";

        while (true) {

            for (int i = 0; i < no.getNivelNo(); i++) {
                spaces += "  ";
            }

            System.out.println(spaces + no.getValorNo());

            if (no.getFilhoEsqNo() != null) {
                printArvore(no.getFilhoEsqNo());
            }

            if (no.getFilhoDirNo() != null) {
                printArvore(no.getFilhoDirNo());
            }

            break;
        }
    }
}

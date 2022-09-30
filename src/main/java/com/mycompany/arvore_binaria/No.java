/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_binaria;

/**
 * @author vinyj
 */
public class No {
    //Atributos do nó
    private int valor;
    private No filhoEsq;
    private No filhoDir;
    private int nivel;

    //Construtor do nó
    public No(int valor) {
        this.valor = valor;
        this.filhoEsq = null;
        this.filhoDir = null;
    }

    //Método de adição do filho esquerdo do nó
    public void adicionarFilhoEsqAoNo(No no) {
        no.nivel = this.nivel + 1;
        this.filhoEsq = no;
    }

    //Método de adição do filho direito do nó
    public void adicionarFilhoDirAoNo(No no) {
        no.nivel = this.nivel + 1;
        this.filhoDir = no;
    }

    //Método que retorna o valor do nó
    public int getValorNo() {
        return valor;
    }
    
    //Método que seta o valor do no
    public void setValorNo(int valor) {
        this.valor = valor;
    }

    //Método que retorna o filho esquerdo do nó
    public No getFilhoEsqNo() {
        return filhoEsq;
    }
    
    //Método que seta o filho esquerdo do nó
    public void setFilhoEsqNo(No filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    //Método que retorna o filho direito do nó
    public No getFilhoDirNo() {
        return filhoDir;
    }
    
    //Método que seta o filho direito do nó
    public void setFilhoDirNo(No filhoDir) {
        this.filhoDir = filhoDir;
    }

    //Método que retorna o nível do nó
    public int getNivelNo() {
        return nivel;
    }
    
    //Método que seta o nivel  do nó
    public void setNivelNo(int nivel) {
        this.nivel = nivel;
    }
    
    //Método que retorna o grau do nó
    public int getGrau() {
        if (filhoEsq == null && filhoDir == null) {
            return 0;
        } else if (filhoEsq != null && filhoDir != null) {
            return 2;
        } else {
            return 1;
        } 
    }
}

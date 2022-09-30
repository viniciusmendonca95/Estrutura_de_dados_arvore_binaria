/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_binaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author vinyj
 */
public class Arvore {
    //Atributos da árvore binária
    private No noRaiz;
    private List<No> elementos;

    //Construtor da árvore binária
    public Arvore() {
        this.setNoRaiz(null);
        this.elementos = new ArrayList<>();
    }

    //Método que retorna o nó raiz da árvore
    public No getNoRaiz() {
        return noRaiz;
    }

    //Método que seta o nó raiz da árvore
    public void setNoRaiz(No noRaiz) {
        this.noRaiz = noRaiz;
    }

    //Método que gera e retorna a lista de elementos da árvore
    public List<No> geraElementos(No no) {
        if (no != null && no.getNivelNo() == 0) {
            elementos.add(no);
        }

        while (true) {
            if (no != null && no.getFilhoEsqNo() != null) {
                elementos.add(no.getFilhoEsqNo());
                geraElementos(no.getFilhoEsqNo());
            }
            if (no != null && no.getFilhoDirNo() != null) {
                elementos.add(no.getFilhoDirNo());
                geraElementos(no.getFilhoDirNo());
            }

            break;
        }

        return this.elementos;
    }

    public List<No> geraElementos2(No no, Boolean flag) {
        if (flag) {
            elementos.add(no);
        }
        if (no.getFilhoEsqNo() != null) {
            elementos.add(no.getFilhoEsqNo());
            geraElementos2(no.getFilhoEsqNo(), false);
        }
        if (no.getFilhoDirNo() != null) {
            flag = false;
            elementos.add(no.getFilhoDirNo());
            geraElementos2(no.getFilhoDirNo(), false);
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

    //Método que retorna o grau da árvore
    public int getGrauArvore() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        int maiorGrau = 0;

        for (No elemento : elementos) {
            if (elemento.getGrau() > maiorGrau) {
                maiorGrau = elemento.getGrau();
            }
        }

        return maiorGrau;
    }

    //Método que retorna o grau da árvore
    public void getGrauNos() {
        elementos.clear();
        elementos = geraElementos(noRaiz);


        for (No elemento : elementos) {
            System.out.println("Grau do nó " + elemento.getValorNo() + ": " + elemento.getGrau());
        }

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

    //Método para inserir nó na árvore
    public void inserirNoNaArvore(No no, int valor) {
        if (no.getValorNo() == valor) {
            System.out.println("\nO nó com esse valor já existe na arvore");
        } else if (no == null) {
            no.setValorNo(valor);
        } else {
            if (valor < no.getValorNo()) {
                if (no.getFilhoEsqNo() == null) {
                    No novo = new No(valor);
                    no.setFilhoEsqNo(novo);
                    novo.setNivelNo(no.getNivelNo() + 1);
                } else {
                    inserirNoNaArvore(no.getFilhoEsqNo(), valor);
                }
            } else {
                if (no.getFilhoDirNo() == null) {
                    No novo = new No(valor);
                    no.setFilhoDirNo(novo);
                    novo.setNivelNo(no.getNivelNo() + 1);
                } else {
                    inserirNoNaArvore(no.getFilhoDirNo(), valor);
                }
            }

        }
    }

    //Método para inserir nó raiz na árvore
    public void inserirNoNaArvore(int valor) {
        if (this.getNoRaiz() == null) {
            this.noRaiz = new No(valor);
        } else {
            inserirNoNaArvore(this.noRaiz, valor);
        }
    }

    //Método para remover no da árvore
    public void removerNoArvore(No no, No pai, int valor) {
        //se o no em questao nao possui o valor a ser removido
        if (no.getValorNo() != valor) {
            if (valor < no.getValorNo()) {
                if (no.getFilhoEsqNo() != null) {
                    removerNoArvore(no.getFilhoEsqNo(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            } else {
                if (no.getFilhoDirNo() != null) {
                    removerNoArvore(no.getFilhoDirNo(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            }

        }
        //se o no em questao possui o valor a ser removido      
        else {
            No aux;
            //caso de remocao de folha
            if (no.getFilhoDirNo() == null && no.getFilhoEsqNo() == null) {

                // se o no a ser removido for filho direito do pai
                if (pai.getFilhoDirNo() == no) {
                    pai.setFilhoDirNo(null);
                } else {
                    pai.setFilhoEsqNo(null);
                }
            }
            //caso onde o no possui 1 filho
            else if (no.getFilhoDirNo() == null || no.getFilhoEsqNo() == null) {

                //se nao há subarvore à direita, pegue o antecessor
                if (no.getFilhoEsqNo() != null) {
                    if (no == this.noRaiz) {
                        this.noRaiz = no.getFilhoEsqNo();
                    } else {
                        no.getFilhoEsqNo().setNivelNo(pai.getNivelNo() + 1);
                        if (pai.getFilhoEsqNo() == no)
                            pai.setFilhoEsqNo(no.getFilhoEsqNo());
                        else if (pai.getFilhoDirNo() == no)
                            pai.setFilhoDirNo(no.getFilhoEsqNo());
                    }
                }
                //se nao há subarvore à esquerda, pegue o sucessor
                else {

                    if (no == this.noRaiz) {
                        this.noRaiz = no.getFilhoDirNo();
                    } else {
                        no.getFilhoDirNo().setNivelNo(pai.getNivelNo() + 1);
                        if (pai.getFilhoDirNo() == no) {
                            pai.setFilhoDirNo(no.getFilhoDirNo());
                        } else if (pai.getFilhoEsqNo() == no) {
                            pai.setFilhoEsqNo(no.getFilhoDirNo());
                        }
                    }
                }
            }
            /*caso de remocao de no com dois filhos: copie o sucessor para o no a ser removido
            e remova o sucessor*/
            else {
                elementos = geraElementos2(no.getFilhoEsqNo(), true);
                No max = elementos.stream().max(Comparator.comparing(No::getValorNo)).get();
                removerNoArvore(no, no, max.getValorNo());
                no.setValorNo(max.getValorNo());
            }
        }
    }

    public void removerNoArvore(int valor) {
        //caso em que a arvore está vazia
        if (this.getNoRaiz() == null) {
        }
        //caso em que há apenas a raiz
        else if (this.getNoRaiz().getValorNo() == valor &&
                this.getNoRaiz().getFilhoEsqNo() == null &&
                this.getNoRaiz().getFilhoDirNo() == null) {
            this.noRaiz = null;
        } else {
            removerNoArvore(this.getNoRaiz(), this.getNoRaiz(), valor);
        }
    }


    //Método que printa a árvore de forma identada    
    public void printArvore(No no) {
        String spaces = "";

        while (no != null) {

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

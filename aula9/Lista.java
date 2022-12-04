/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Random;

/**
 *
 * @author Aguin
 */
public class Lista {
    Celula primeiro, ultimo, removido = new Celula(null);
    int tamanho;

    void addInicio(Object elemento) {
        Celula nova = new Celula(primeiro, elemento);
        this.primeiro = nova;

        if (this.tamanho == 0) {
            ultimo = primeiro;
        }
        this.tamanho++;
    }

    void addFinal(Object elemento) {
        if (this.tamanho == 0) {
            addInicio(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.tamanho++;
        }
    }

    boolean posicaoOcupada(int pos) {
        if ((pos >= 0) && (pos < this.tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    Celula pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao inexistente!");
        } else {
            Celula atual = this.primeiro;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProximo();
            }
            return (atual);

        }
    }

    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            this.addInicio(elemento);
        } else {
            if (pos == this.tamanho) {
                this.addFinal(elemento);
            } else {
                Celula anterior = this.pegarCelula(pos - 1);
                Celula nova = new Celula(anterior.getProximo(), elemento);
                anterior.setProximo(nova);
                this.tamanho++;
            }
        }
    }

    Object pega(int pos) { 
        return (this.pegarCelula(pos).getElement());
    }
    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição inexistente!");
        } else {
            this.primeiro = this.primeiro.getProximo();
           
            if (this.tamanho == 0) {
                this.ultimo = null;
            }
        }
    }

    void remover(int pos) {

        if (posicaoOcupada(pos)) {
            if (pos == 0) {
                removido = this.pegarCelula(pos);
                imprimirRemovido();
                removerInicio();
            }
            if ((pos > 0) && (pos < this.tamanho)) {
                removido = this.pegarCelula(pos);
                imprimirRemovido();

                if (pos == tamanho - 1) {
                    Celula anterior = this.pegarCelula(pos - 1);
                    ultimo = anterior;
                }else {
                    Celula proximo = this.pegarCelula(pos + 1);
                    Celula anterior = this.pegarCelula(pos - 1);
                    anterior.setProximo(proximo);
                }

            }

            this.tamanho--;

        } else {
            throw new IllegalArgumentException("Nao e possivel remover, por que não há posiçao!");
        }
    }

    Boolean contem(Object elemento) {
        Celula atual = this.primeiro;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProximo();
        }
        return false;
    }

    int tamanho() {
        return this.tamanho;
    }

    Random random = new Random();
    int sorteado = 0;

    int x = 20;
    void sortear() {
        for (int i = 0; i <= 19; i++) {
            System.out.println(" \nrodada numero " + (i + 1) + "\n");

            if(x == 0){
                sorteado = 0;
            }else {
                sorteado = random.nextInt(x);
            }
            this.remover(sorteado);

            x--;

            for (int j = 0; j < x; j++) {
                Pessoa atual = (Pessoa) pega(j);

                System.out.println("O nome da pessoa e: " + atual.nome);
                System.out.println("Seu telefone e: " + atual.telefone);
                System.out.println("Seu endereco e: " + atual.endereco);
                System.out.println("Seu CPF e: " + atual.cpf + "\n\n");

            }

        }
    }

    void imprimirRemovido() {
        Pessoa removid = (Pessoa) removido.getElement();

        System.out.println("A pessoa removida e: " + removid.nome);
        System.out.println("Seu numero e: " + removid.telefone);
        System.out.println("Seu endereco e: " + removid.endereco);
        System.out.println("Seu CPF e: " + removid.cpf + "\n\n\n");
    }

}

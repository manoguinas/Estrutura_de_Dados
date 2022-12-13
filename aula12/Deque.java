/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author Aguin
 */
public class Deque {
    Celula head, proximo, anterior;
    int tamanho = 0;

    void firstAdd(Object elemento) {
        Celula nova = new Celula(elemento);
        nova.setProxima(nova);
        nova.setAnterior(nova);
        head = nova;
        tamanho++;
    }

    void addCom(Object elemento) {
        if (tamanho == 0) {
            firstAdd(elemento);

        } else {

            if (tamanho == 1) {
                Celula nova = new Celula(elemento);

                nova.setProxima(head.getProximo());
                nova.setAnterior(head.getAnterior());
                head.setProxima(nova);
                head.setAnterior(nova);
                head = nova;
                tamanho++;
            } else {

                Celula nova = new Celula(elemento);
                Celula anterior = head.getAnterior();

                nova.setProxima(head);
                nova.setAnterior(head.getAnterior());
                head.setAnterior(nova);
                anterior.setProxima(nova);
                head = nova;
                tamanho++;
            }
        }
    }

    void addFim(Object elemento) {
        if (tamanho == 0) {
            firstAdd(elemento);
        } else {

            Celula nova = new Celula(elemento);
            Celula anterior;

            nova.setProxima(head);
            nova.setAnterior(head.getAnterior());
            anterior = nova.getAnterior();
            anterior.setProxima(nova);
            head.setAnterior(nova);
            tamanho++;
        }
    }

    Object pegarElement(String placa) {
       Celula atual = head;
       
       do{
           if(atual.getElement().equals(placa)) {
               return atual.getElement();
            }
            
            atual.getProximo();
        } while(atual != head);
        
        throw new IllegalArgumentException("Este veiculo nao existe");
    }

    void removeCom() {
        if (tamanho == 1) {
            clear();
        }

        if(tamanho == 0 ) {
            System.out.println("Nao e possivel remover pois a lista esta vazia");
        } else {
            head.getProximo().setAnterior(head.getAnterior());
            head.getAnterior().setProxima(head.getProximo());
            head = head.getProximo();
            tamanho--;
            
        }

    }

    void removeFim() {
        if (tamanho == 1) {
            clear();
        }

        if( tamanho == 0 ) {
            System.out.println("Nao e possivel remover pois a lista esta vazia");
        } else {
            
            Celula anterior = head.getAnterior();
    
            anterior.getAnterior().setProxima(head);
            head.setAnterior(anterior.getAnterior());
            tamanho--;
        }
    }

    void clear() {
        head.setAnterior(null);
        head.setProxima(null);
        head = null;
        tamanho = 0;
    }

    void imprimirLista() {
        Celula atual = head;

        if (tamanho == 0) {
            System.out.println("A lista esta vazia");
        } else {

            do {
                Carro carro = (Carro) atual.getElement();
                System.out.println("O modelo do carro e: " + carro.modelo);
                System.out.println("O proprietario do carro e: " + carro.proprietario);
                System.out.println("---------");
                atual = atual.getProximo();
            } while (atual != head);

        }

    }

}
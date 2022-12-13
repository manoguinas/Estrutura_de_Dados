/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author Aguin
 */
public class Estacionamento {
    Deque deque = new Deque();
    Carro carro = new Carro();
    FilaEspera filaEspera = new FilaEspera();
    ForaEstac foraEstac = new ForaEstac();
    
    boolean verfVaga() {
      if(deque.tamanho <10) {
        return true;
      } 
      return false;
    }

    void remover(String placa) {
        Celula removida = deque.head;
        Celula atual = (Celula) deque.pegarElement(placa);

        while(atual != deque.head) {
            foraEstac.ladoFora.add(removida);
            deque.removeCom();
            atual.getProximo();
        }
        
    }
    
}
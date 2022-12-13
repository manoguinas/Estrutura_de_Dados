/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author Aguin
 */
public class Celula {
    Celula proximo, anterior;
    Object elemento;
    Celula(Object elemento){
        this.elemento = elemento;
    }

    void setProxima(Celula prox) {
        this.proximo = prox;
    }

    void setAnterior(Celula ant) {
        this.anterior = ant;
    }

    Celula getProximo() {
        return this.proximo;
    }

    Celula getAnterior() {
        return this.anterior;
    }

    Object getElement() {
        return this.elemento;
    }

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;
import Celula.CelulaAux;
package Pilha;

/**
 *
 * @author Aguin
 */
public class PilhaAux {
    CelulaAux topo = null;

    void push(String expressao) {
        CelulaAux nova = new CelulaAux(expressao, topo);
        this.topo = nova;
    }



    int sizePilha() {
        CelulaAux p;
        int cont = 0;
        p = topo;
        while(p!=null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }
}
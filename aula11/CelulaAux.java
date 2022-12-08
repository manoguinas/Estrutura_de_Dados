/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;
package Celula;

/**
 *
 * @author Aguin
 */
public class CelulaAux {
    String expressao;
    CelulaAux anterior;
    
    CelulaAux(){}

    public CelulaAux(String expressao, CelulaAux anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    public CelulaAux getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaAux anterior) {
        this.anterior = anterior;
    }
}
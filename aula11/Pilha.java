/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;
import javax.swing.JOptionPane;
import Celula.Celula;
import Celula.CelulaAux;
package Pilha;

/**
 *
 * @author Aguin
 */
public class Pilha {
    Celula topo = null;

    PilhaAux pilhaAux = new PilhaAux();

    void push(String expressao) {
        Celula nova = new Celula(expressao, topo);
        this.topo = nova;
    }

    int sizePilha() {
        Celula p;
        int cont = 0;
        p = topo;
        while (p != null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }

    public boolean vefExpressao() {
        String expressao = JOptionPane.showInputDialog(null, "Digite a expressao a ser analisada!!!");
        boolean x = false;

        for (int i = 0; i < expressao.length(); i++) {
            String expr = "";
            expr += expressao.charAt(i);

            if (expr.equals("{") || expr.equals("[") || expr.equals("(")) {
                push(expr);
            }
        }
        for (int i = expressao.length() - 1; i >= 0; i--) {
            String expr = "";
            expr += expressao.charAt(i);

            if (expr.equals("}") || expr.equals("]") || expr.equals(")")) {
                pilhaAux.push(expr);
            }
        }

        Celula p = topo;
        CelulaAux p2 = pilhaAux.topo;

        while ((p != null) && (p2 != null)) {

            if (sizePilha() == pilhaAux.sizePilha()) {

                if (p.getExpressao().equals("{")) {

                    if (p2.getExpressao().equals("}")) {
                        x = true;
                    } else {
                        x = false;
                    }

                    if(p.getAnterior() == null){
                        break;
                    }else {
                        p = p.getAnterior();
                        p2 = p2.getAnterior();
                    }
                }

                if (p.getExpressao().equals("[")) {
                    if (p2.getExpressao().equals("]")) {
                        x = true;
                    } else {
                        x = false;
                    }

                    if(p.getAnterior() == null){
                        break;
                    }else {
                        p = p.getAnterior();
                        p2 = p2.getAnterior();
                    }
                }

                if (p.getExpressao().equals("(")) {
                    if (p2.getExpressao().equals(")")) {
                        x = true;
                    } else {
                        x = false;
                    }

                    if(p.getAnterior() == null) {
                        break;
                    }else {
                        p = p.getAnterior();
                        p2 = p2.getAnterior();
                    }
                }
            } else {
                break;
            }
        }
        return x;
    }

}
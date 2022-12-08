/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula11;
import Pilha.Pilha;

/**
 *
 * @author Aguin
 */
public class Aula11 {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        if(pilha.vefExpressao()) {
            System.out.println("A expressao esta digitada corretamente!!!");
        }else {
            System.out.println("A expressao esta digitada incorretamente!!!");
        }
    }
}

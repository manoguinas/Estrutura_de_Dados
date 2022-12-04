/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author Aguin
 */
public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.sortear();

        for (int i = 0; i < lista.array.length; i++) {
            lista.ordemCres(lista.array[i]);
        }

        System.out.println("---------");
        lista.imprimirCresc();
        
        System.out.println("---------");
        lista.imprimirDesc();
        
        System.out.println("---------");    
        lista.numeroPrimo();

        System.out.println("---------");
        lista.imprimirCresc();
    }
}
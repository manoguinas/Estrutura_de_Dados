/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer23;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer23 {

    public static void main(String[] args) {
        
        int a, d;
        String s;
        
        s = JOptionPane.showInputDialog ("Digite um número de 3 casas: ");
        a = (int) Float.parseFloat(s);
        
        d = a % 100 / 10 ;
        System.out.println("Algarismo da casa das dezenas: " +d);
    }
}

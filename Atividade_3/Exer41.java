/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer41;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer41 {

    public static void main(String[] args) {
        
        float a, b, c, d, mp;
        String s;
        
        s = JOptionPane.showInputDialog ("Primeiro numero: ");
        a = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog ("Segundo numero: ");
        b = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog ("Terceiro numero: ");
        c = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog ("Quarto numero: ");
        d = (int) Float.parseFloat(s);
        
        mp = (a*1 + b*2 + c*3 + d*4)/10; 
        
        System.out.print ("Media dos numeros: "+mp);
    }
}

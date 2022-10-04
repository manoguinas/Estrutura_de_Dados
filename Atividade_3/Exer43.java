/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer43;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer43 {

    public static void main(String[] args) {
         
        double num, base, logaritmo;
        String s;
       
        s = JOptionPane.showInputDialog("Valor do logaritmando: ");
        num = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Valor da base: ");
        base = Double.parseDouble(s);
        
        logaritmo = Math.log (num) / Math.log(base);
        System.out.format("Logaritmo de %.2f na base %.2f: %.2f ", num, base,logaritmo);
    }
}

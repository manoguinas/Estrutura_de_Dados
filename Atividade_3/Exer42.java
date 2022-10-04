/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer42;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer42 {

    public static void main(String[] args) {
        
        float angulo, rang;
        String s;
        
        s = JOptionPane.showInputDialog("Escreva um angulo em graus: ");
        angulo = Float.parseFloat(s);
        
        rang = (float) (angulo * Math.PI / 180);
        
        System.out.println("Seno: " +Math.sin(rang));
        System.out.println("Cosseno: " +Math.cos(rang));
        System.out.println("Tangente: " +Math.tan(rang));
        System.out.println("Cossecante: " +1/Math.sin(rang));
        System.out.println("Secante: " +1/Math.cos(rang));
        System.out.println("Cotangente: " +1/Math.tan(rang));
    }
}

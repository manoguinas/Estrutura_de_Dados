/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer48;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer48 {

    public static void main(String[] args) {
        
        double sm, qtdade, preco, vp, vd;
        String s;
        
        s = JOptionPane.showInputDialog("Escreva o salario minimo: ");
        sm = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Escreva uma quantidade em quilowatt: ");
        qtdade = Double.parseDouble(s);
        
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        
        System.out.format("Preco do quilowatt: "+preco);
        System.out.format("\nValor a ser pago: "+vp);
        System.out.format("\nValor com desconto: "+vd);
    }
}

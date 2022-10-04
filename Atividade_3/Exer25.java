/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer25;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer25 {

    public static void main(String[] args) {
        
        int data, dia, mes, ano;
        String s;
        
        
        s = JOptionPane.showInputDialog("Digite a data no formato DDMMAA: ");
        data = (int) Float.parseFloat(s);
        
        dia = data / 10000;
        System.out.println("Dia: "+dia);
        
        mes = data %10000 / 100;
        System.out.println("Mes: " +mes);
        
        ano = data % 100;
        System.out.println("Ano: " +ano);
    }
}

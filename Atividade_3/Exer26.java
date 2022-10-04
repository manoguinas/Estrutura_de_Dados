/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer26;
import javax.swing.JOptionPane;

/**
 *
 * @author Aguin
 */
public class Exer26 {

    public static void main(String[] args) {
        int data, dia, mes, ano, ndata;
        String s;
        
       s = JOptionPane.showInputDialog("Digite sua data de nascimento no formato DDMMAA:");
       data = (int) Float.parseFloat(s);
       
       dia = data / 10000;
       System.out.println("Dia:" +dia);
       
       mes = data % 10000 / 100;
       System.out.println("Mes:" +mes);
       
       ano = data % 100;
       System.out.println("Ano:" +ano);
       
       ndata = mes * 10000 + dia*100+ano;
       System.out.println("Data no formato MMDDAA: " +ndata);
    }
}

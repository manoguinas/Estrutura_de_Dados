/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atv2;

/**
 *
 * @author Aguin
 */
public class Atv2 {

    public static void main(String[] args) {
        System.out.println("Resposta1  Raiz de 64 : " + Math.sqrt(64));
        
        Double a = (Math.exp(0.5 * Math.log(64)));
        int b = (int) Math.round(a);

        System.out.println("Resposta2  Raiz com exp, log e realint: h " + b);
        System.out.println("Resposta3  Raiz com exp e log sem realint: h " +  Math.exp(0.5 * Math.log(64)));
        
        Double a1 = Math.sin(45*3.14/180 + 0.0001)*10000*0.1;
        
        System.out.println("Resposta4  Formatar "+ Math.ceil(a1)*0.001);

        Double a2 =Math.floor(Math.exp(3*Math.log(8) + 0.001))*1000;
        
             
        System.out.println("Resposta5  Potencia com exp e log formatado: " + a2*0.001);
        System.out.println("Resposta6  Potencia com exp e log sem formatar: " + Math.exp(3*Math.log(8)));
        System.out.println("Resposta7  Potencia com operador ** e formatar: ");
        System.out.println("Resposta8  Raiz cubica " + Math.exp(1/3 * Math.log(8)));
        System.out.println("Resposta9  Absoluto " + Math.abs(-8));
        System.out.println("Resposta10 Absoluto " + Math.abs(8));
        System.out.println("Resposta11 Convertendo para o Inteiro: 5.5 " + Math.round(5.5));
        System.out.println("Resposta12 Convertendo para o Inteiro: 6.5 " + (int )Math.floor(6.5));
        System.out.println("Resposta13 Convertendo para o Inteiro: 6.5 + 0.0001: " + Math.round(6.5 + 0.0001));
        System.out.println("Resposta14 Convertendo para o Inteiro: 5.45 " + Math.round(5.45));
        System.out.println("Resposta15 Convertendo para o Inteiro: 5.51 " + Math.round(5.51));
        System.out.println("Resposta16 Convertendo para o Real 87: " + Double.parseDouble("87"));
        System.out.println("Resposta17 Convertendo pata o Inteiro 3/4: " + Math.round(0.75));
    }
}

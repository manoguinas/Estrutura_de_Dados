/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;

/**
 *
 * @author Aguin
 */
public class LerDados { 
    String arquivo; 
    
    void lerNomeArquivo(){
        Scanner ler = new Scanner(System.in); 
        System.out.println("Digite o nome do arquivo"); 
        this.arquivo = ler.nextLine(); 
    }
    
    void leConteudoArquivo(){
        try{
            FileReader arq = new FileReader(this.arquivo); 
            BufferedReader lerConteudo = new BufferedReader(arq);
            
            String linha = lerConteudo.readLine();
            while(linha != null){
                System.out.println("Valor no arquivo: "+linha);
                linha = lerConteudo.readLine();
            }
            
            arq.close();
        }catch(IOException e){
            System.err.println("Erro ao abrir o arquivo");
            e.getMessage();
            
        }
    }
}
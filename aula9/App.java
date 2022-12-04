/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.app;

/**
 *
 * @author Aguin
 */
public class App{
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("1 Bruna", "(64) 99487-9848", "Rua 1", "123.123.123-13");
        Pessoa pessoa2 = new Pessoa("2 Eduardo", "(64) 98189-2578", "Rua 2", "456.456.456-46");
        Pessoa pessoa3 = new Pessoa("3 Felipe", "(64) 98741-1478", "Rua 3", "789.789.789-79");
        Pessoa pessoa4 = new Pessoa("4 Aline", "(64) 95748-9658", "Rua 4", "159.269.148-49");
        Pessoa pessoa5 = new Pessoa("5 Laura", "(64) 98735-5978", "Rua 5", "968.487.598-87");
        Pessoa pessoa6 = new Pessoa("6 Carlos", "(64) 95784-5201", "Rua 6", "258.489.777-69");
        Pessoa pessoa7 = new Pessoa("7 João", "(64) 99415-6874", "Rua 7", "789.487.489-59");
        Pessoa pessoa8 = new Pessoa("8 Marta", "(64)99889-9857", "Rua 8", "047.445.921-21");
        Pessoa pessoa9 = new Pessoa("9 Pedro", "(64) 92415-8741", "Rua 9", "147.598.777-54");
        Pessoa pessoa10 = new Pessoa("10 Helena", "(64)97584-6824", "Rua 10", "784.598.587-99");
        Pessoa pessoa11 = new Pessoa("11 Cláudia", "(64)93687-4984", "Rua 11", "210.265.999-87");
        Pessoa pessoa12 = new Pessoa("12 Marina", "(64) 92487-8927", "Rua 12", "787.788.588-89");
        Pessoa pessoa13 = new Pessoa("13 Rodrigo", "(64)91478-6819", "Rua 13", "487.299.874-88");
        Pessoa pessoa14 = new Pessoa("14 Aguinaldo", "(64) 95487-2839", "Rua 14", "002.012.022-87");
        Pessoa pessoa15 = new Pessoa("15 Luisa", "(64)99898-6548", "Rua 15", "487.999.874-87");
        Pessoa pessoa16 = new Pessoa("16 Thiago", "(64)99633-3223", "Rua 16", "148.587.999-99");
        Pessoa pessoa17 = new Pessoa("17 Samuel", "(64)99784-2847", " Rua 17", "147.574.111-10");
        Pessoa pessoa18 = new Pessoa("18 Timoteo", "(64) 99741-1010", "Rua 18", "000.333.000-98");
        Pessoa pessoa19 = new Pessoa("19 Nathany", "(64) 99252-2548", "Rua 19", "487.787.987-99");
        Pessoa pessoa20 = new Pessoa("20 Samyra", "(64) 99441-1010", "Rua 20", "999.888.774-87");

        Lista lista = new Lista();

        lista.addFinal(pessoa1);
        lista.addFinal(pessoa2);
        lista.addFinal(pessoa3);
        lista.addFinal(pessoa4);
        lista.addFinal(pessoa5);
        lista.addFinal(pessoa6);
        lista.addFinal(pessoa7);
        lista.addFinal(pessoa8);
        lista.addFinal(pessoa9);
        lista.addFinal(pessoa10);
        lista.addFinal(pessoa11);
        lista.addFinal(pessoa12);
        lista.addFinal(pessoa13);
        lista.addFinal(pessoa14);
        lista.addFinal(pessoa15);
        lista.addFinal(pessoa16);
        lista.addFinal(pessoa17);
        lista.addFinal(pessoa18);
        lista.addFinal(pessoa19);
        lista.addFinal(pessoa20);

        lista.sortear();
        System.out.println(lista.tamanho);

    }
}

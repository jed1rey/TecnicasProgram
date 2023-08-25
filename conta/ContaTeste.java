/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

import java.util.Scanner;

/**
 *
 * @author 1091392313004
 */
public class ContaTeste {
    public static void main(String[] args){
        //cria um objeto scanner para obter a entrada a partir do terminal
        Scanner input = new Scanner(System.in);
        
        //cria um objeto Conta a partir da classe conta
        Conta minhaConta = new Conta();
        
        //exibe o valor inicial
        System.out.printf("O valor inicial de nome é %s%n%n", minhaConta.getName());
        
    }
    
}

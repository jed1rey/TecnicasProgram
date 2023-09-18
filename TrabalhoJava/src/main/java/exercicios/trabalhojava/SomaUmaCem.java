package exercicios.trabalhojava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author paula
 */

// 1. Faça um programa que imprima a soma dos números de 1 a 100.

public class SomaUmaCem {

    public static void main(String[] args) {
        int soma = 0; 

        for (int i = 1; i <= 100; i++) { 
            soma = soma + i; 
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

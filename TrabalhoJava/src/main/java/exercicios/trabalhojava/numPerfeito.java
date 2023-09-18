/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trabalhojava;

import java.util.Scanner;

/**
 *
 * @author paula
 */
// 5. Crie um programa que leia um número e verifique se ele é um número perfeito
// (soma dos seus divisores é igual a ele mesmo).
public class numPerfeito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int somaDiv = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDiv += i;  //soma os divisores no caso de divisao exata 
            }
        }

        if (somaDiv == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }
    }
}



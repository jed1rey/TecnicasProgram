/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trabalhojava;

/**
 *
 * @author paula
 */
import java.util.Scanner;

// Escreva um programa que leia um número inteiro e verifique se ele é um número par ou ímpar.


public class ParOuImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        String resultado = (num % 2 == 0) ? "par" : "ímpar"; //ternario

        System.out.printf("O número %d é %s", num, resultado); // %d = inteiro %s = string
    }
}

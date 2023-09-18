/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trabalhojava;

/**
 *
 * @author paula
 */
// 06. Crie um programa que leia um número e imprima a sequência de Fibonacci até o número informado.
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int ant = 0;
        int atual = 1;

        System.out.println("Sequência de Fibonacci até " + num + ":");

        for (int i = 0; ant <= num; i++) {
            System.out.print(ant + " "); //primeiro imprime o 0, depois faz a troca
            
            int proximo = ant + atual;
            ant = atual;
            atual = proximo; //faz a troca e adiciona o proximo num

        }
    }
}

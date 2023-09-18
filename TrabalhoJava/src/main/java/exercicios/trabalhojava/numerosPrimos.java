/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trabalhojava;

/**
 *
 * @author paula
 */


// 2. Escreva um programa que leia um número 
// e imprima todos os números primos menores ou iguais ao número informado.
import java.util.Scanner;

public class numerosPrimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print ("Digite um número: ");
        int num = input.nextInt();

        System.out.println("Números primos menores ou iguais a " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (Primo(i)) {  //chama a funcao 
                System.out.print(i + " ");
            }
        }
    }

    // verificando se o numero é primo
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;  //numero primo tem que ser maior qie 1
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // nao é primo
            }
        }
        return true; // é primo
    }
}

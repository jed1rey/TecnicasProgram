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

//04 . Escreva um programa que leia um número e calcule o fatorial desse número.
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int ft = 1;
        
        if(num < 0) {
            System.out.print("O número não pode ser negativo.");
        } else if(num < 2) {
            System.out.println("Fatorial de " + num + "= 1");
        } else {
            for(int i = 1; i <= num; i++) {
                ft = ft * i;
            }
            System.out.printf("%d! = %d", num, ft);
        }
    }
}

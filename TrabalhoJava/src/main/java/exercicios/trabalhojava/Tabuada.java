/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trabalhojava;

/**
 *
 * @author paula
 */

//3. Crie um programa que leia um número e imprima a tabuada de multiplicação desse número de 1 a 10.
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        int[] tabuada = new int[11]; //lista para guardar os results 

        for (int i = 0; i <= 10; i++) {
            tabuada[i] = num * i;  //for para guardar as infos na lista[i]
        }

        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + tabuada[i]); //for para mostrar o array
        }
    }
}

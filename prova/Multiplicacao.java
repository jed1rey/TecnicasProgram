/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.prova;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Multiplicacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        int result = num1 * num2;

        System.out.println("O resultado da multiplicação é: " + result);

    }

}

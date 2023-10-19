/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
import java.util.Scanner;
public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); //instancia classe Calculadora
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();
        
        System.out.println ("############# RESULTADOS ##########");
        System.out.println("Soma: " + calc.somar(a, b));
        System.out.println("Subtração: " + calc.subtrair(a, b));
        System.out.println("Multiplicação: " + calc.multiplicar(a, b));
        System.out.println("Divisão: " + calc.dividir(a, b));
    }

}
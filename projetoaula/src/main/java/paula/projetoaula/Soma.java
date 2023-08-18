/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paula.projetoaula;

import java.util.Scanner;

/**
 *
 * @author 1091392313004
 */
public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        
        System.out.printf(" A soma é: %d%n", sum);
                
          
        
    }
    
}

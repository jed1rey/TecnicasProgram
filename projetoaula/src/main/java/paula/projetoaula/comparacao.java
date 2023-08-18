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
public class comparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        
        if (num1 == num2)
            System.out.printf("%d == %d%n", num1, num2);
        
        if (num1 != num2)
            System.out.printf("%d é diferente que %d%n", num1, num2);
        
        if (num1 < num2)
            System.out.printf("%d menor que %d%n", num1, num2);
       
        if (num1 > num2)
            System.out.printf("%d maior que %d%n", num1, num2);
    }
    
}

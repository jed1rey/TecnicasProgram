/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author 1091392313004
 */

import java.util.Scanner;

public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cria um array com tamanho 5
        int[] numeros = new int[5];
    
    //preenche o array com numeros informados pelo usuario
    
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < numeros.length; i++){
    System.out.print("Informe o " + (i+1) + " número: ");
    numeros[i] = input.nextInt();
    }
    
    //imprime os números do array
    System.out.print("Números informados: ");
    for (int i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
    }
    
    //calcula a media dos números
    double soma = 0; //double = float
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    
    double media = soma / numeros.length;
    System.out.println("Média dos números: ");
  }
}  


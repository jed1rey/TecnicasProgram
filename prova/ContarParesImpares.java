/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.prova;

/**
 *
 * @author paula
 */
public class ContarParesImpares {

    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int Par = 0;
        int Impar = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }
        }
        System.out.println("Pares: " + Par);
        System.out.println("Impar: " + Impar);
    }

}

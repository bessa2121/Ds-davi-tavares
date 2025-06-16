/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.Random;

/**
 *
 * @author DAVI
 */
public class Exercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          int[] vetor = new int[30];
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
        }

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int num : vetor) {
            if (num > maior) {
                segundoMaior = maior;
                maior = num;
            } else if (num > segundoMaior && num != maior) {
                segundoMaior = num;
            }
        }

        System.out.println("Vetor:");
        for (int n : vetor) System.out.print(n + " ");
        System.out.println("\nSegundo maior valor: " + segundoMaior);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author DAVI
 */
public class Exercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         int[] vetor = new int[30];
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(50) + 1;
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));

        // Algoritmo para encontrar a subsequência crescente mais longa (LIS - Longest Increasing Subsequence)
        int[] dp = new int[30];
        Arrays.fill(dp, 1);

        int maxLength = 1;

        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        System.out.println("Comprimento da subsequência crescente mais longa: " + maxLength);
    }
}

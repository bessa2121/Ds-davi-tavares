/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.Arrays;

/**
 *
 * @author DAVI
 */
public class Exercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 7, 2, 8, 6, 9, 1, 4}; // Vetor com 10 números inteiros
        
        Arrays.sort(numeros); // Ordena o vetor em ordem crescente

        System.out.println("Elementos em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

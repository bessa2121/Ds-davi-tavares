/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 7, 2, 8, 6, 9, 1, 4}; // Vetor com 10 números inteiros
        
        System.out.println("Elementos em posições ímpares:");
        for (int i = 1; i < numeros.length; i += 2) { // Percorre apenas as posições ímpares
            System.out.print(numeros[i] + " ");
        }
    }
}

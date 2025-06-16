/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = {10, -5, 7, -3, 0, -12, 8, 6, -1, 4};

        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Substituindo elementos negativos por zero
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("\nVetor após substituição dos negativos por zero:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

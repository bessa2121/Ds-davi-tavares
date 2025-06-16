/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int constante = 3;

        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Multiplicando cada elemento pela constante
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= constante;
        }

        System.out.println("\nVetor após multiplicação por " + constante + ":");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

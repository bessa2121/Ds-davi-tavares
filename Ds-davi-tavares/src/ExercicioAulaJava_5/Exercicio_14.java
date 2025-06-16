/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 7, 2, 8, 6, 9, 1, 4}; // Vetor com 10 números inteiros
        
        // Substitui os elementos menores que 5 por 5
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5) {
                numeros[i] = 5;
            }
        }

        // Exibe o vetor modificado
        System.out.println("Vetor após a substituição:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

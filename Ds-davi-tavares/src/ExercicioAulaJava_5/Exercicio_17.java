/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 4, 13, 2, 17, 10, 19, 16, 1, 14};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

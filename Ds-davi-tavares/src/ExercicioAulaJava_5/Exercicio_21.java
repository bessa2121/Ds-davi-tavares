/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_21 {

     public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particiona(arr, inicio, fim);
            quickSort(arr, inicio, pivo - 1);
            quickSort(arr, pivo + 1, fim);
        }
    }

    private static int particiona(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                troca(arr, i, j);
            }
        }
        troca(arr, i + 1, fim);
        return i + 1;
    }

    private static void troca(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 4, 13, 2, 17, 10, 19, 16, 1, 14, 21, 22, 30, 25, 24, 23, 28, 27, 26, 29};
        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Vetor ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

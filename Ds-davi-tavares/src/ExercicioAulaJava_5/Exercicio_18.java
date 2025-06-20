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
public class Exercicio_18 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 4, 13, 2, 17, 10, 19, 16, 1, 14};
        Arrays.sort(numeros); // A busca binária só funciona em vetores ordenados
        int elementoBuscado = 7;
        int inicio = 0, fim = numeros.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (numeros[meio] == elementoBuscado) {
                encontrado = true;
                break;
            } else if (numeros[meio] < elementoBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elementoBuscado + " encontrado!");
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado.");
        }
    }
}

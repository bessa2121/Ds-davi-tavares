/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;
import java.util.Arrays;
/**
 *
 * @author CAMARGO
 */
public class Exercicio_23 {
    
    public static void main(String[] args) {
        // Inicialização do vetor com 30 números inteiros
        int[] vetor = new int[30];
        for (int i = 0; i < 30; i++) {
            vetor[i] = i + 1; // Preenchendo o vetor com números de 1 a 30
        }

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        // Rotação à direita em uma posição
        int ultimoElemento = vetor[vetor.length - 1];
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = ultimoElemento;

        System.out.println("Vetor após rotação à direita:");
        System.out.println(Arrays.toString(vetor));
    }
}


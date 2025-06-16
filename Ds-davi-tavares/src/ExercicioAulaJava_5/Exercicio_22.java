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
public class Exercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        int[] vetor = new int[30];
        Random rand = new Random();

        // Preenchendo o vetor com números aleatórios entre 1 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
        }

        // Ordenando o vetor
        Arrays.sort(vetor);

        // Calculando a mediana
        double mediana;
        int meio1 = vetor[14];
        int meio2 = vetor[15];
        mediana = (meio1 + meio2) / 2.0;

        // Exibindo o vetor e a mediana
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        System.out.println("Mediana: " + mediana);
    }
}

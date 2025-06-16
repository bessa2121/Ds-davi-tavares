/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }
    }
}

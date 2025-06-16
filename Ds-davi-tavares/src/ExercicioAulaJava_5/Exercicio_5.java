/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int[] vetor = {3, 8, 15, 22, 7, 10, 6, 13, 5, 4};
        int pares = 0;
        int impares = 0;

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

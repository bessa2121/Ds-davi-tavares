/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        double media = (double) soma / vetor.length;

        System.out.println("Média dos elementos: " + media);
    }
}

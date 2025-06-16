/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 7, 2, 8, 6, 9, 1, 4}; // Vetor com 10 números inteiros
        int soma = 0;

        // Calcula a soma dos elementos
        for (int numero : numeros) {
            soma += numero;
        }

        // Calcula a média
        double media = (double) soma / numeros.length;

        // Conta quantos elementos são maiores que a média
        int contador = 0;
        for (int numero : numeros) {
            if (numero > media) {
                contador++;
            }
        }

        System.out.println("Média dos elementos: " + media);
        System.out.println("Quantidade de elementos maiores que a média: " + contador);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 3, 5, 7, 6, 8, 12, 9, 15, 4}; // Vetor com 10 números inteiros
        
        System.out.println("Elementos múltiplos de 3:");
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}

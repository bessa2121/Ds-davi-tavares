/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAVI
 */
public class Exercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 5, 13, 2, 17, 10, 19, 16, 12, 14};
        Set<Integer> conjunto = new HashSet<>();

        System.out.println("Vetor sem duplicatas:");
        for (int numero : numeros) {
            if (conjunto.add(numero)) { // Adiciona apenas se ainda não estiver no conjunto
                System.out.print(numero + " ");
            }
        }
    }
}

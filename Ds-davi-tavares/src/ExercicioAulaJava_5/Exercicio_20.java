/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAVI
 */
public class Exercicio_20 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 4, 13, 2, 17, 10, 19, 16, 1, 14};
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Elementos pares:");
        System.out.println(pares);
        System.out.println("Elementos ímpares:");
        System.out.println(impares);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.Laços;

/**
 *
 * @author DAVI
 */
public class Exercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0;

        while (popA <= popB) {
            popA += popA * 0.03;
            popB += popB * 0.015;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população de A ultrapassar ou igualar B.");
    }
}

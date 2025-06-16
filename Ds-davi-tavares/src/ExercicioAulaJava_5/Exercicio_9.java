/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = {10, 25, 30, 5, 60, 15, 40, 22, 35, 18};
        int valorEspecifico = 25;

        System.out.println("Elementos maiores que " + valorEspecifico + ":");
        for (int num : vetor) {
            if (num > valorEspecifico) {
                System.out.println(num);
            }
        }
    }
}

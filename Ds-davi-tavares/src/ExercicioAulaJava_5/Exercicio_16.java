/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

/**
 *
 * @author DAVI
 */
public class Exercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {12, 5, 18, 7, 20, 3, 15, 6, 8, 9, 11, 4, 13, 2, 17, 10, 19, 16, 1, 14};
        int elementoBuscado = 7;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == elementoBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elementoBuscado + " encontrado!");
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado.");
        }
    }
}

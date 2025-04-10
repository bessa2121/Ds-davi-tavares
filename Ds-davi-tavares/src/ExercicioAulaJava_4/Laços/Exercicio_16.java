/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.Laços;

/**
 *
 * @author DAVI
 */
public class Exercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.print("Série de Fibonacci até ultrapassar 500: ");
        System.out.print(a + " " + b + " ");

        while (true) {
            int proximo = a + b;
            if (proximo > 500) break;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
    }
}

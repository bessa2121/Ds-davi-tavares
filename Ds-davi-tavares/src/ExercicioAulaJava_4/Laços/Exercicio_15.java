/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.Laços;

import java.util.Scanner;
/**
 *
 * @author DAVI
 */
public class Exercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 1, b = 1;

        System.out.print("Série de Fibonacci: " + a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}

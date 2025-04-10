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
public class Exercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um valor N (maior que 0): ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("VALOR INVÁLIDO! Digite novamente.");
            }
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

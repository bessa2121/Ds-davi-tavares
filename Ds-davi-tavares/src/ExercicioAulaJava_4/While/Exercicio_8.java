/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.While;

import java.util.Scanner;
/**
 *
 * @author DAVI
 */
public class Exercicio_8 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (1 a 20): ");
        int lado = scanner.nextInt();

        // Verifica se está dentro do intervalo permitido
        if (lado < 1 || lado > 20) {
            System.out.println("Tamanho inválido. Digite um número entre 1 e 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    // Imprime * na primeira ou última linha, ou na primeira/última coluna
                    if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Próxima linha
            }
        }

        scanner.close();
    }
}
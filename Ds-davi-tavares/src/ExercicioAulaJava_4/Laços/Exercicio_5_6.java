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
public class Exercicio_5_6 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            double nota1 = -1;
            double nota2 = -1;

            // Lê a primeira nota com validação
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida.");
                }
            }

            // Lê a segunda nota com validação
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida.");
                }
            }

            // Calcula e mostra a média
            double media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno: " + media);

            // Pergunta se deseja realizar um novo cálculo
            System.out.print("NOVO CÁLCULO (S/N)? ");
            opcao = scanner.next().toUpperCase().charAt(0);

        } while (opcao == 'S');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

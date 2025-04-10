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
public class Exercicio_1_4 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;

        // Lê o segundo valor com validação
        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO. O segundo valor não pode ser zero.");
            System.out.print("Digite um novo valor: ");
            valor2 = scanner.nextDouble();
        }

        // Realiza a divisão e mostra o resultado
        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}

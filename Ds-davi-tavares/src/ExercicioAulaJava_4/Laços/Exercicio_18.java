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
public class Exercicio_18 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int n = scanner.nextInt();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = scanner.nextInt();
            soma += num;
            if (num < menor) menor = num;
            if (num > maior) maior = num;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        scanner.close();
    }
}

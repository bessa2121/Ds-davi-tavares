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
public class Exercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um número de 1 a 10 para ver a tabuada: ");
            valor = scanner.nextInt();

            if (valor < 1 || valor > 10) {
                System.out.println("VALOR INVÁLIDO! Tente novamente.");
            }
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

        scanner.close();
    }
}

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
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maior = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número digitado foi: " + maior);

        scanner.close();
    }        
}
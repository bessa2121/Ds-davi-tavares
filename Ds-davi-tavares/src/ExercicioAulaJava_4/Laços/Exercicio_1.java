/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.Laços;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Exercicio_1 {

/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          Scanner Value = new Scanner(System.in);
        
        System.out.println("Escreva um numero: ");
        float Number1 = Value.nextFloat();
        
        System.out.println("Escreva um numero: ");
        float Number2 = Value.nextFloat();
        
        // Usando o laço for para garantir que Number2 não seja zero
        for (; Number2 == 0; ) {
            System.out.println("Escreva outro numero (não pode ser zero): ");
            Number2 = Value.nextFloat();  // Solicita o número ao usuário

            if (Number2 == 0) {  // Se Number2 for zero, avisa o usuário
                System.out.println("Número 2 não pode ser zero. Tente novamente.");
            }
        }
        
        // Realiza a divisão após a validação
        float Number3 = Number1 / Number2;
        System.out.println("Sua razão entre o primeiro numero e o segundo numero é: " + Number3);
    }
}

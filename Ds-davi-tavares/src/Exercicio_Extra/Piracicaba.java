/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercicio_Extra;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */

public class Piracicaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[4];
        int[] num2 = new int[4];
        int soma = 0;

        for (int i = 0; i < num1.length; i++) {
            System.out.print("Digite o valor das notas do primeiro avaliador. NOTA " + i + ": ");
            num1[i] = sc.nextInt();
            soma += num1[i];
        }

        for (int j = 0; j < num2.length; j++) {
            System.out.print("Digite o valor das notas do segundo avaliador. NOTA " + j + ": ");
            num2[j] = sc.nextInt();
            soma += num2[j];
        }

        int media = soma / (int)(num1.length + num2.length);

        System.out.println("As notas digitadas foram:");
        for (int i = 0; i < num1.length; i++) {
            System.out.println("Média 1[" + i + "]: " + num1[i]);
        }
        for (int j = 0; j < num2.length; j++) {
            System.out.println("Média 2[" + j + "]: " + num2[j]);
        }

        System.out.println("Sua média é: " + media);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.While;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Enquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        
        while (numero<=10)
        {
            System.out.println("O numero é: "+numero++);
            
        }
    }
}

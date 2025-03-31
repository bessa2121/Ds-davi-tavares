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
public class laços_de_repetição {

 /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int Numero = Entrada.nextInt();
        
        for (int i = Numero ; i<10 ; i++){
            System.out.print("A partir de " + Numero);   
            System.out.println(", seus números até 10 são: " +i);
        }
    }
}

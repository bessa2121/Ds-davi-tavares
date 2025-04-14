/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments&
     */
    public static void main(String args[]) {
        
        Scanner Read = new Scanner(System.in);
        String[] Name = new String[4]; 
        String[] LastName = new String[4];
        
        for(int i = 0; i < Name.length; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            Name[i] = Read.nextLine(); 
        }
        
        for(int j = 0; j < Name.length; j++) {
            System.out.print("Digite o sobrenome " + (j+1) + ": ");
            LastName[j] = Read.nextLine(); 
        }
        
        System.out.println("\nNomes Completos:");
        for(int z = 0; z < Name.length; z++) {
            System.out.println(Name[z]+" "+LastName[z]);
        }
        
        Read.close();
    }
}

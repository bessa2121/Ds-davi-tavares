/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicioaulajava;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class ExercicioAula2_Java{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner leia = new Scanner (System.in );
        System.out.println("Entre com seu nome: ");
        
        String nomeusuario = leia.nextLine();
        
        System.out.println("Nome do usuário: "+nomeusuario);
        
    }
}

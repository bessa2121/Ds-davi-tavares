/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner(System.in);
        System.out.println("Insira um número aleatório:\n");
        int Algoritmo = Numero.nextInt();
        float Numero_Anterior = Algoritmo-1;
        System.out.println("O numero anterior ao inserido é:"+Numero_Anterior);
        // TODO code application logic here
    }
}

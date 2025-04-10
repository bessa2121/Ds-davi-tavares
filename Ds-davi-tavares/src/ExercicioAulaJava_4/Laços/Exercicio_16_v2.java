/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_4.Laços;

/**
 *
 * @author DAVI
 */
public class Exercicio_16_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Outra forma de fazer o exercicio 16
        int a = 0, b = 1;
        int proximo = a + b;

        System.out.print("Série de Fibonacci até ultrapassar 500: ");
        System.out.print(a + " " + b + " ");

    do {
        System.out.print(proximo + " ");
        a = b;
        b = proximo;
        proximo = a + b;
        } while (proximo <= 500);
    }
}

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
public class Vacina {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = Integer.parseInt(scanner.nextLine());
            
            String[] genes = new String[N];
            
            for (int i = 0; i < N; i++) {
                genes[i] = scanner.nextLine();
            }
            
            String geneAlvo = scanner.nextLine();
            
            int contador = 0;
            for (String gene : genes) {
                if (gene.equals(geneAlvo)) {
                    contador++;
                }
            }
            
            if (contador > 1) {
                System.out.println("Achei o danado");
            } else if (contador == 1) {
                System.out.println("Ainda não é o suficiente");
            } else {
                System.out.println("Sumiuu!");
            }
        }
    }
}

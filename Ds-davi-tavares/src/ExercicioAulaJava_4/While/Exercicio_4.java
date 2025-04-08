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
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int totalAlunos = scanner.nextInt();

        int contador = 0;
        double somaNotas = 0;

        while (contador < totalAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / totalAlunos;
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
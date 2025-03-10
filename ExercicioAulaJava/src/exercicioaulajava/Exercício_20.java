/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aulajavaexercicios;

import java.util.Scanner;

/**
 *
 * @author joaod
 */
public class EX20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        String tipoCombustivel = scanner.next();

        System.out.println("Digite a quantidade de litros vendidos: ");
        float litros = scanner.nextInt();
        float PrecoPorLitroGasolina = 3.30f;
        float PrecoPorLitroAlcool = 2.90f;
        int desconto = 0;

        if (tipoCombustivel.equals("A") || tipoCombustivel.equals("a")) {
            if (litros <= 20) {
                desconto = 3;
            } else {
                desconto = 5;
            }
        } else if (tipoCombustivel.equals("G") || tipoCombustivel.equals("g")) {
            if (litros <= 20) {
                desconto = 4;
            } else {
                desconto = 6;
            }
        } else {
            System.out.println("que combustivel é esse??? só tem alcool (A) e Gasolina (G) man, da run dnv e nao erra!!");
            scanner.close();
            return;
        }
         if(tipoCombustivel.equals("G")){
        float valorBruto = litros * PrecoPorLitroGasolina;
        float valorDesconto = (valorBruto * desconto) / 100;
        float valorFinal = valorBruto - valorDesconto;
        System.out.println("Valor final a pagar: R$" + valorFinal);
         } else if (tipoCombustivel.equals("A")){
        float valorBruto = litros * PrecoPorLitroAlcool;
        float valorDesconto = (valorBruto * desconto) / 100;
        float valorFinal = valorBruto - valorDesconto;
        System.out.println("Valor final a pagar: R$" + valorFinal);
         }
        

        

        
    }
}

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
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // TODO code application logic here
        Scanner Idade = new Scanner(System.in);
        System.out.println("Escreva a sua idade :");
        
        int UserIdade = Idade.nextInt();
        
        int Dias;
        int Meses;
        
        Dias = UserIdade * 365;
        Meses = UserIdade * 12;
        System.out.println("Você Tem :"+Dias+" Dias, ou :"+Meses+"Meses, ou :"+UserIdade+" Anos");
        
        
    }
}

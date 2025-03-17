package ExercicioAulaJava_1;

/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author davi
 */
import java.util.Scanner;
public class Exercício_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de votos válidos:");
        int Votos_Validos = Numero.nextInt();
        
        System.out.println("Informe a quantidade de votos nulos");
        int Votos_Nulos = Numero.nextInt();
        
        System.out.println("Informe a quantidade de votos brancos");
        int Votos_Brancos = Numero.nextInt();
        
        int Votos_Totais = Votos_Brancos + Votos_Nulos + Votos_Validos;
        
        float Porcentagem_Votos_Nulos = Votos_Nulos*100/Votos_Totais;
        float Porcentagem_Votos_Brancos = Votos_Brancos*100/Votos_Totais;
        float Porcentagem_Votos_Validos = Votos_Validos*100/Votos_Totais;
        
        System.out.println("Total de Votos: "+Votos_Totais);
        System.out.println("Votos validos: "+Votos_Validos+"("+Porcentagem_Votos_Validos+"%)");
        System.out.println("Votos nulos: "+Votos_Nulos+"("+Porcentagem_Votos_Nulos+"%)");
        System.out.println("Votos brancos: "+Votos_Brancos+"("+Porcentagem_Votos_Brancos+"%)");
        // TODO code application logic here
    }
}

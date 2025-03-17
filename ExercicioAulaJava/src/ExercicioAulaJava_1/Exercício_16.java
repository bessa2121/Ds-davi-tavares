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
public class Exercício_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner(System.in);
        System.out.println("Informe o preço de fábrica do carro:");
        float Preço_Fabrica = Numero.nextInt();
        float Imposto = Preço_Fabrica*0.45f;
        float Preço_Distribuidor = Preço_Fabrica*0.28f;
        
        float Preço_Final = Preço_Fabrica + Imposto + Preço_Distribuidor;
        System.out.println("O preço que o cliente irá pagar será de R$"+Preço_Final);
        // TODO code application logic here
    }
}

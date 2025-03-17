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
public class Exercício_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner (System.in);
        System.out.println("Informe o custo de fábrica do carro:");
        float Preço_Fabrica_Carro = Numero.nextInt();
        float Imposto = Preço_Fabrica_Carro*0.45f;
        float Percentual_Distribuidor = Preço_Fabrica_Carro*0.28f;
        float Preço_Total = Preço_Fabrica_Carro + Imposto + Percentual_Distribuidor;
        System.out.println("O custo total para o consumidor é de R$"+Preço_Total);
        
        // TODO code application logic here
    }
}

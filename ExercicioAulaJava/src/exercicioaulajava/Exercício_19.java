/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicioaulajava;
import java.util.Scanner;
/**
 *
 * @author davi
 */
public class Exercício_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
          
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        String tipoCombustivel = scanner.next();

        System.out.println("Digite a quantidade de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.println("Digite o preço por litro: ");
        int precoPorLitro = scanner.nextInt();

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
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        int valorBruto = litros * precoPorLitro;
        int valorDesconto = (valorBruto * desconto) / 100;
        int valorFinal = valorBruto - valorDesconto;

        System.out.println("Valor sem desconto: R$" + valorBruto);
        System.out.println("Desconto aplicado: R$" + valorDesconto);
        System.out.println("Valor final a pagar: R$" + valorFinal);

        scanner.close();
    }
}

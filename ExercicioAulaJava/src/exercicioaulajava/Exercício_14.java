package exercicioaulajava;

/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author davi
 */
import java.util.Scanner;
public class Exercício_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner(System.in);
        System.out.println("Informe o salário do funcionário:");
        float Salario_Funcionario = Numero.nextInt();
        System.out.println("Informe o percentual do reajuste:");
        float Percentual_Reajuste = Numero.nextInt();
        System.out.println("O reajuste é um aumento ou diminuição?\n1)Aumento\n2)Diminuição");
        int Escolha = Numero.nextInt();
        
        float Reajuste = Salario_Funcionario*Percentual_Reajuste/100;
        
        if (Escolha == 1){
            float Salario_Final = Salario_Funcionario + Reajuste;
            System.out.println("O salario do funcionario irá aumentar para R$"+Salario_Final);
        }
        
        else{
            float Salario_Final = Salario_Funcionario - Reajuste;
            System.out.println("O salario do funcionario irá diminuir para R$"+Salario_Final);
        }
       
                // TODO code application logic here
    }
}

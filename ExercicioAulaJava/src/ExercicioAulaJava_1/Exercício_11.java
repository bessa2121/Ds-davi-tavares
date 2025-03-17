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
public class Exercício_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Numero = new Scanner(System.in);
        
        System.out.println("Informe a sua idade em anos:");
        int anos = Numero.nextInt();
        
        System.out.println("Informe agora a sua idade em meses, de acordo com o exemplo:'Eu tenho 15 anos e 3 meses de vida'");
        int meses = Numero.nextInt();
        
        System.out.println("Informe agora a sua idade em dias, seguindo o padrão anterior");
        int dias = Numero.nextInt();
        
        int Meses_Para_Dias = meses*30;
        int Anos_Para_Dias = anos*365;
        int Dias_Vividos_Totais = Meses_Para_Dias + Anos_Para_Dias + dias;
        
        System.out.println("Você viveu até agora "+Dias_Vividos_Totais+" dias");
        // TODO code application logic here
    }
}

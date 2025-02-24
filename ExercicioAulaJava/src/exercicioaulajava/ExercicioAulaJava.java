/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaulajava;

/**
 *
 * @author CAMARGO
 */
public class ExercicioAulaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Exercicio 1
        
        int Numero1 = 20;
        int Numero2 = 10;
        int ResultadoSoma = Numero1+Numero2;
        int ResultadoMultiplicação = Numero1*Numero2;
        float ResultadoDivisão = Numero1/Numero2;
        int ResultadoSubtração = Numero1-Numero2;           
        
        
        System.out.println("Exercicio 1 - Programa para Cálculos");
        System.out.println("O resultado da soma é: "+ResultadoSoma);
        System.out.println("O resultado da multiplicação é: "+ResultadoMultiplicação);
        System.out.println("O resultado da divisão é: "+ResultadoDivisão);
        System.out.println("O resultado subtração é: "+ResultadoSubtração);
        
        //Exercicio 2
              
        float DistanciaTotalPercorrida = 20;
        float TotalCombustivelGasto = 100;
        float ConsumoMédio = TotalCombustivelGasto/DistanciaTotalPercorrida ;
        System.out.println("");
        System.out.println("Exercicio 2 - Consumo Médio");
        System.out.println("Consumo Médio do Combustivel é: "+ConsumoMédio);
        
        //Exercicio 3
        
        String NomeVendedor = "Carlinhos";
        int SalárioFixo = 3500;
        int TotalVendasEfetuadas = 1500;
        float SalárioTotal = SalárioFixo + (TotalVendasEfetuadas/0.15f);
       
        System.out.println("");
        System.out.println("Exercício 3 - Salário Total de um Vendedor");
        System.out.println("Nome do vendedor: "+NomeVendedor);
        System.out.println("Salário fixo do vendedor: "+SalárioFixo);
        System.out.println("Sálario Total no fim do mês (Salário fixo e 10% das vendas efetuadas): "+SalárioTotal);
        
        //Exercicio 4
        
        float BaseRetangulo = 10f;
        float AlturaRetangulo = 20f;
        float AreaRetangulo = BaseRetangulo*AlturaRetangulo;
        
        System.out.println("");
        System.out.println("Exercicio 4 - Área do Retangulo");
        System.out.println("A área do retangulo é: "+AreaRetangulo);
        
        //Exercicio 5/
        
        int x = 1;
        int y = 2;
        int z = y;
                
        System.out.println("");
        System.out.println("Exercicio 5 - Troca de Variaveis");
        System.out.println("X é: "+x);
        System.out.println("Y é: "+y);
        
        y = x;
        x = z;
        
        System.out.println("Agora X é: "+x);
        System.out.println("Agora Y é: "+y);
        
        //Exercicio 6/ 
        
        float PreçoCombustivel = 5.00f;
        float DistanciaViagem = 50;
        float CombustivelGastoPorKm = 0.5f;
        float CombustivelNecessario = DistanciaViagem/CombustivelGastoPorKm;
        float CustoEstimado = CombustivelNecessario*PreçoCombustivel;
        
        System.out.println("");
        System.out.println("Exercicio 6 - Custo Estimado com combustivel");
        System.out.println("Custo estimado com combustivel é: "+CustoEstimado);
        
    }
    
}

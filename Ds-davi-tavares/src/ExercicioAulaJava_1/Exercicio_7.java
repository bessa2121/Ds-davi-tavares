/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioAulaJava_1;

/**
 *
 * @author CAMARGO
 */
public class Exercicio_7 {
    public static void main(String[] args){
        float Consumo_Alcool = 3.2f;
        float Consumo_Gasolina = 1.4f;
        float Distancia_Percorrida = 70;
        float Litros_Gasolina_Necessaria = Consumo_Gasolina*Distancia_Percorrida;
        float Litros_Alcool_Necessaria = Consumo_Alcool*Distancia_Percorrida;
        float Preço_Gasolina = 4.1f;
        float Preço_Alcool = 3.4f;
        float Gasto_Gasolina = Preço_Gasolina*Litros_Gasolina_Necessaria;
        float Gasto_Alcool = Preço_Alcool*Litros_Alcool_Necessaria;
        System.out.println("O gasto com gasolina em uma viagem de 70 quilômetros seria de R$"+Gasto_Gasolina);
        System.out.println("O gasto com alcool em uma viagem de 70 quilômetros seria de R$"+Gasto_Alcool);
    }
}

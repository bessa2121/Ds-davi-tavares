/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

import java.util.ArrayList;
import java.util.Scanner;

// Classe principal - Cafeteria Virtual
public class CafeteriaVirtual {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Produto> pedido = new ArrayList<>();
            
            System.out.println("Bem-vindo a Cafeteria Virtual!");
            
            // Solicitar saldo da carteira
            System.out.print("\nDigite o valor disponível na sua carteira: R$ ");
            double saldoCliente = scanner.nextDouble();
            
            // Escolha do tipo de café
            System.out.println("\nTipos de cafe:");
            String[] tiposCafe = {"Expresso - R$ 5,00", "Latte - R$ 7,50", "Cappuccino - R$ 6,50"};
            double[] precosCafe = {5.00, 7.50, 6.50};
            
            for (int i = 0; i < tiposCafe.length; i++) {
                System.out.println((i + 1) + " - " + tiposCafe[i]);
            }
            
            System.out.print("Digite o número do cafe desejado: ");
            int escolhaTipo = scanner.nextInt();
            String tipoCafeEscolhido = tiposCafe[escolhaTipo - 1];
            double precoBaseCafe = precosCafe[escolhaTipo - 1];
            
            // Escolha do tamanho do café
            System.out.println("\nEscolha o tamanho do cafe:");
            String[] tamanhosCafe = {"Pequeno - R$ 0,00 (adicional)", "Médio - R$ 2,00 (adicional)", "Grande - R$ 4,00 (adicional)"};
            double[] adicionaisPreco = {0.0, 2.0, 4.0};
            
            for (int i = 0; i < tamanhosCafe.length; i++) {
                System.out.println((i + 1) + " - " + tamanhosCafe[i]);
            }
            
            System.out.print("Digite o numero do tamanho desejado: ");
            int escolhaTamanho = scanner.nextInt();
            String tamanhoEscolhido = tamanhosCafe[escolhaTamanho - 1];
            double precoFinalCafe = precoBaseCafe + adicionaisPreco[escolhaTamanho - 1];
            
            // Escolha da quantidade de cafés
            System.out.print("\nQuantos cafes deseja pedir? ");
            int quantidadeCafe = scanner.nextInt();
            pedido.add(new Cafe(tipoCafeEscolhido, precoFinalCafe, tamanhoEscolhido, quantidadeCafe));
            
            // Perguntar se o cliente quer um doce
            System.out.print("\nDeseja adicionar um doce ao seu pedido? (1 - Sim / 2 - Nao): ");
            int desejaDoce = scanner.nextInt();
            
            if (desejaDoce == 1) {
                System.out.println("\nEscolha um doce:");
                Doce[] doces = {
                    new Doce("Brownie", 10.00, true, 1),
                    new Doce("Cookie", 8.00, false, 1),
                    new Doce("Bolo de Cenoura", 12.00, true, 1)
                };
                
                for (int i = 0; i < doces.length; i++) {
                    System.out.print((i + 1) + " - ");
                    doces[i].exibirDetalhes();
                }
                
                System.out.print("Digite o numero do doce desejado: ");
                int escolhaDoce = scanner.nextInt();
                
                System.out.print("\nQuantos doces deseja pedir? ");
                int quantidadeDoce = scanner.nextInt();
                
                pedido.add(new Doce(doces[escolhaDoce - 1].nome, doces[escolhaDoce - 1].preco, doces[escolhaDoce - 1].temRecheio, quantidadeDoce));
            }
            
            // Calcular total do pedido
            double total = 0;
            for (Produto item : pedido) {
                total += item.getPrecoTotal();
            }
            
            // Verificar se o cliente tem saldo suficiente
            if (saldoCliente >= total) {
                saldoCliente -= total;
                System.out.println("\nCompra realizada com sucesso! ✅");
                System.out.println("\nSeu pedido:");
                for (Produto item : pedido) {
                    item.exibirDetalhes();
                }
                System.out.println("\nTotal pago: R$ " + total);
                System.out.println("Saldo restante na carteira: R$ " + saldoCliente);
            } else {
                System.out.println("\nSaldo insuficiente! ❌");
                System.out.println("Você nao pode concluir a compra. Seu saldo atual e R$ " + saldoCliente + ", mas o pedido custa R$ " + total + ".");
            }
        }
        System.out.println("\nObrigado por visitar nossa Cafeteria Virtual!");
    }
}
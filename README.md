# Ds-davi-tavares
Desenvolvimento de Sistemas por Prof João Siles e Davi Villar

Por favor explicar sobre MAX_VALUE e MIN_VALUE !!!


1.	Crie um vetor de 10 números inteiros e exiba todos os elementos.
2.	Calcule a soma de todos os elementos de um vetor de 10 números inteiros.
3.	Encontre o maior e o menor valor em um vetor de 10 números inteiros.
4.	Inverta a ordem dos elementos de um vetor de 10 números inteiros.
5.	Conte quantos números pares e ímpares existem em um vetor de 10 números inteiros.
6.	Crie um vetor de 10 números inteiros e exiba apenas os elementos nas posições pares.
7.	Calcule a média dos elementos de um vetor de 10 números inteiros.
8.	Multiplique todos os elementos de um vetor de 10 números inteiros por um valor constante.
9.	Crie um vetor de 10 números inteiros e exiba os elementos que são maiores que um valor específico.
10.	Substitua todos os elementos negativos de um vetor de 10 números inteiros por zero.
11.	Crie um vetor de 10 números inteiros e exiba os elementos em ordem crescente.
12.	Conte quantos elementos de um vetor de 10 números inteiros são maiores que a média dos elementos.
13.	Crie um vetor de 10 números inteiros e exiba os elementos que são múltiplos de 3.
14.	Substitua todos os elementos de um vetor de 10 números inteiros que são menores que 5 por 5.
15.	Crie um vetor de 10 números inteiros e exiba os elementos que estão em posições ímpares.

Nível Médio
11.	Implemente um algoritmo de busca linear para encontrar um elemento em um vetor de 20 números inteiros.
12.	Crie um vetor de 20 números inteiros e ordene-o usando o algoritmo Bubble Sort.
13.	Implemente um algoritmo de busca binária para encontrar um elemento em um vetor de 20 números inteiros ordenado.
14.	Crie um vetor de 20 números inteiros e remova todos os elementos duplicados.
15.	Crie um vetor de 20 números inteiros e divida-o em dois vetores: um com os elementos pares e outro com os ímpares.
Nível Difícil
16.	Implemente o algoritmo Quick Sort para ordenar um vetor de 30 números inteiros.
17.	Crie um vetor de 30 números inteiros e encontre a mediana dos elementos.
18.	Implemente um algoritmo que rotacione os elementos de um vetor de 30 números inteiros para a direita em uma posição.
19.	Crie um vetor de 30 números inteiros e encontre o segundo maior valor.
20.	Implemente um algoritmo que encontre a subsequência crescente mais longa em um vetor de 30 números inteiros.

PESQUISAR CONCEITOS COMPLEMENTARES DE POO


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	double Hamburguer = 8.50;
	double Refri = 3.50;
	double Mentos = 2.50;
	
	int quantidade_Hamburguer = 0;
	int quantidade_Refri = 0;
	int quantidade_Mentos = 0;
	
	System.out.println("Informe a quantia de dinheiro na sua carteira: ");
	double carteira = input.nextDouble();
	
	
	 int option;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1 - Hamburguer " + Hamburguer);
                System.out.println("2 - Refri " + Refri);
                System.out.println("3 - Mentos " + Mentos);
                System.out.println("4 - Hamburguer + Refri " + (Hamburguer + Refri));
                System.out.println("5 - Hamburguer + Mentos " + (Hamburguer + Mentos));
                System.out.println("6 - Hamburguer + Refri + Mentos " + (Hamburguer + Refri + Mentos));
                System.out.println("7 - Refri + Mentos " + (Refri + Mentos));
                System.out.println("0 - Finalize a Compra...");
                System.out.print("Escolha uma opção: ");
                option = input.nextInt();

                switch (option) {
                    case 1 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Hamburguer que voce deseja: ");
	                    quantidade_Hamburguer = input.nextInt();
                    }
	                    
                    case 2 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Refri que voce deseja: ");
	                    quantidade_Refri = input.nextInt();
                    }     
	                    
                    case 3 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Mentos que voce deseja: ");
                    	quantidade_Mentos = input.nextInt();
                    }
                    	
                    case 4 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Hamburguer que voce deseja: ");
                    	quantidade_Hamburguer = input.nextInt();
	
	                    System.out.println("Informe a quantidade de Refri que voce deseja: ");
                    	quantidade_Refri = input.nextInt();
                    }
                    	
                    case 5 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Hamburguer que voce deseja: ");
	                    quantidade_Hamburguer = input.nextInt();
	
	                    System.out.println("Informe a quantidade de Mentos que voce deseja: ");
	                    quantidade_Mentos = input.nextInt();
                    }
	                    
                    case 6 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                       	System.out.println("Informe a quantidade de Hamburguer que voce deseja: ");
                    	quantidade_Hamburguer = input.nextInt();
	
	                    System.out.println("Informe a quantidade de Refri que voce deseja: ");
                    	quantidade_Refri = input.nextInt();
	
                    	System.out.println("Informe a quantidade de Mentos que voce deseja: ");
                    	quantidade_Mentos = input.nextInt();
                    }
	
                    case 7 ->
                    {
                        System.out.println("Ao colocar a quantidade finalize a compra");
                        System.out.println("Informe a quantidade de Refri que voce deseja: ");
	                    quantidade_Refri = input.nextInt();
	
	                    System.out.println("Informe a quantidade de Mentos que voce deseja: ");
                    	quantidade_Mentos = input.nextInt();
                    }
                    	
                    case 0 ->
                        System.out.println("0 - Finalize a Compra...");
                        
                    default ->
                        System.out.println("Opção Inválida.Tente Novamente.");
                }
                
            } while (option != 0);
	
	double Hamburguer_preço = Hamburguer*quantidade_Hamburguer;
	double Refri_preço = Refri*quantidade_Refri;
	double Mentos_preço = Mentos*quantidade_Mentos;
	
	double carrinho = 0;
	carrinho = Hamburguer_preço + Refri_preço + Mentos_preço;
	
	if(carteira>=carrinho){
	    System.out.println("A compra foi realizada e te restou:  R$" + (carteira-carrinho));
	}
	else{
	    System.out.println("A compra não foi realizada e te restou:  R$" + carteira );
	}
	
	input.close();
}

}

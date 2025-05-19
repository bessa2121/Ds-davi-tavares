/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

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


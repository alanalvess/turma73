package atividades240227;

import java.util.Scanner;

public class A05 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String produto = "";
		int codigo, quantidade;
		float preco = 0, valorTotal;
				
		System.out.println("Digite o código do pedido de 1 a 6?\n"
				+ "1- Cachorro quente\n"
				+ "2- X-Salada\n"
				+ "3- X-Bacon\n"
				+ "4- Bauru\n"
				+ "5- Refrigerante\n"
				+ "6- Suco de laranja\n"
		);
		codigo = leia.nextInt();
		
		System.out.printf("Quantos itens deseja? ");
		quantidade = leia.nextInt();
	
		leia.close();
		
		switch (codigo) {
		case 1:
			produto = "Cachorro quente";
			preco = 10.0f;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.0f;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.0f;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.0f;
			break;
		case 5:
			produto = "Refrigerente";
			preco = 8.0f;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.0f;
			break;
		default:
			System.out.println("Código inválido");
		}
		
		valorTotal = quantidade * preco;
		
		
		System.out.printf("\nProduto: %s\n"
				+ "Valor total: %.2f", produto, valorTotal);

	}
}

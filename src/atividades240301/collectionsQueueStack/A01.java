package atividades240301.collectionsQueueStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		String nome;
		int menu = 0;

		System.out.println("\n*********************************************************\n"
				+ "\n	1 - Adicionar Cliente na Fila" 
				+ "\n	2 - Listar todos os Clientes"
				+ "\n	3 - Retirar cliente da Fila" 
				+ "\n	0 - Sair"
				+ "\n\n*********************************************************" 
				+ "\nEntre com a opção desejada: ");
		menu = leia.nextInt();

		while (menu != 0) {
			switch (menu) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				nome = leia.next();
				fila.add(nome);

				System.out.println("\nFila: ");

				Iterator<String> adicionar = fila.iterator();

				System.out.println();

				while (adicionar.hasNext())
					System.out.println(adicionar.next());

				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: \n");

				Iterator<String> listar = fila.iterator();

				while (listar.hasNext())
					System.out.println(listar.next());
				break;
			case 3:
				if (!fila.isEmpty()) {
					fila.remove();
					System.out.println("\nFila!\n");
					Iterator<String> remove = fila.iterator();

					while (remove.hasNext())
						System.out.println(remove.next());
					System.out.println("\nO Cliente foi Chamado!");
					break;
				} else
					System.out.println("\nA fila está vazia!");
				break;
			default:
				System.out.println("\n*********************************************************\n" 
						+ "\nOpção inválida!"
						+ "\n\n*********************************************************");
				break;
			}

			System.out.println("\n*********************************************************\n"
					+ "\n	1 - Adicionar Cliente na Fila" 
					+ "\n	2 - Listar todos os Clientes"
					+ "\n	3 - Retirar cliente da Fila" 
					+ "\n	0 - Sair"
					+ "\n\n*********************************************************"
					+ "\nEntre com a opção desejada: ");
			menu = leia.nextInt();
		}
		System.out.println("\nPrograma Finalizado!");

		leia.close();
	}

}

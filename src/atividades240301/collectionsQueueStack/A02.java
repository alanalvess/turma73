package atividades240301.collectionsQueueStack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class A02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		String nome;
		int menu = 0;

		do {
			System.out.println("\n*********************************************************\n"
					+ "\n	1 - Adicionar Livro na Pilha" + "\n	2 - Listar todos os Livros"
					+ "\n	3 - Retirar livros da pilha" + "\n	0 - Sair"
					+ "\n\n*********************************************************"
					+ "\nEntre com a opção desejada: ");
			menu = leia.nextInt();

			switch (menu) {
			case 1:
				System.out.println("\nDigite o nome do Livro: ");
				nome = leia.next();
				pilha.push(nome);

				System.out.println("\nPilha: ");

				Iterator<String> adicionar = pilha.iterator();

				System.out.println();

				while (adicionar.hasNext())
					System.out.println(adicionar.next());

				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: \n");

				Iterator<String> listar = pilha.iterator();

				while (listar.hasNext())
					System.out.println(listar.next());
				break;
			case 3:
				if (!pilha.isEmpty()) {
					pilha.pop();
					System.out.println("\nPilha!\n");
					Iterator<String> remove = pilha.iterator();

					while (remove.hasNext())
						System.out.println(remove.next());

					System.out.println("\nO Livro foi retirado da pilha!");
					break;
				} else
					System.out.println("\nA pilha está vazia!");
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\n*********************************************************\n" + "\nOpção inválida!"
						+ "\n\n*********************************************************");
				break;
			}

		} while (menu != 0);

		leia.close();
	}
}

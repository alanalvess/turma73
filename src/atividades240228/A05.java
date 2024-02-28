package atividades240228;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {
			System.out.println("digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) 
				soma += numero;

		} while (numero != 0);

		System.out.printf("\nA soma dos números positivos é: %d", soma);

		leia.close();

	}
}

package atividades240229;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i, j, numeros[][] = new int[3][3], somaPrincipal = 0, somaSecundaria = 0;

		System.out.println("Digite os números da matriz (3 grupos de 3 números cada): ");
		for (i = 0; i < numeros.length; i++) {
			for (j = 0; j < numeros.length; j++) {
				numeros[i][j] = leia.nextInt();
			}

			System.out.println();
		}

		leia.close();

		System.out.println();

		for (i = 0; i < numeros.length; i++) {
			for (j = 0; j < numeros.length; j++) {
				System.out.printf("| %d |", numeros[i][j]);
			}

			System.out.println();
		}

		System.out.println("\nElementos da Diagonal Principal: ");

		for (i = 0; i < numeros.length; i++) {
			for (j = 0; j < numeros.length; j++) {

				if (i == j) {
					somaPrincipal += numeros[i][j];
					System.out.print(numeros[i][j] + " ");
				}
			}
		}

		System.out.println("\n\nElementos da Diagonal Secundária:");

		for (i = 0; i < numeros.length; i++) {
			for (j = 0; j < numeros.length; j++) {

				if (j == numeros.length - 1 - i) {
					somaSecundaria += numeros[i][j];
					System.out.print(numeros[i][j] + " ");
				}
			}
		}

		System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: %d"
				+ "\nSoma dos Elementos da Diagonal Secundária: %d\n", somaPrincipal, somaSecundaria);
	}
}

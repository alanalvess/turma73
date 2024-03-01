package atividades240229;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[10];
		float soma = 0.0f, media = 0.0f;

		System.out.println("Digites os números do vetor (10 números): ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leia.nextInt();
			soma += numeros[i];
		}

		leia.close();

		System.out.println("\nElementos indices impares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		System.out.println("\n\nElementos pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		media = soma / numeros.length;

		System.out.printf("\n\nSoma: %.0f", soma);
		System.out.printf("\nMedia: %.2f", media);

	}
}

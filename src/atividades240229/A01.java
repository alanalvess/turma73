package atividades240229;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroDigitado, indice = -1, numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.printf("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();

		leia.close();

		for (int i = 0; i < numeros.length; i++) {
			if (numeroDigitado == numeros[i]) {
				indice = i;
			}
		}

		if (indice >= 0) {
			System.out.printf("\nO número %d está localizado na posição: %d", numeroDigitado, indice);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", numeroDigitado);
		}
	}
}

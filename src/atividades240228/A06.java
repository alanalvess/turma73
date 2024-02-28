package atividades240228;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0;
		float soma = 0, multiplos3 = 0, mediaMultiplos3 = 0;

		do {
			System.out.println("digite um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				multiplos3++;
			} 
		} while (numero != 0);
		
		mediaMultiplos3 = soma / (multiplos3);

		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", mediaMultiplos3);

		leia.close();

	}

}

package atividades240228;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, pares = 0, impares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			numero = leia.nextInt();

			if (numero % 2 == 0) 
				pares++;
			else 
				impares++;
		}

		System.out.printf("\nTotal de números pares: %d \nTotal de números ímpares: %d", pares, impares);

		leia.close();

	}
}

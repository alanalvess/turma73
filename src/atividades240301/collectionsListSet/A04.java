package atividades240301.collectionsListSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Integer numero;

		Set<Integer> numeros = new HashSet<>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		leia.close();

		if (numeros.contains(numero)) {
			System.out.printf("\nO número %d foi encontrado!", numero);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}
	}
}

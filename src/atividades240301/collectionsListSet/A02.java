package atividades240301.collectionsListSet;

import java.util.ArrayList;
import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Integer numero;

		ArrayList<Integer> numeros = new ArrayList<>();
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
			System.out.printf("\nO número %d está localizado na posição: %d", numero, numeros.indexOf(numero));
		} else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}
	}
}

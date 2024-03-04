package atividades240301.collectionsQueueStack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class A03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		Integer numero;

		System.out.println("Digite 10 números: ");
		for (int i = 0; i < 10; i++) {
			numero = leia.nextInt();
			numeros.add(numero);
		}

		leia.close();

		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}

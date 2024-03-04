package atividades240301;

import java.util.ArrayList;
import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		String cor;

		System.out.println("Digite 5 cores diferentes: ");
		for (int i = 0; i < 5; i++) {
			cor = leia.next();
			cores.add(cor);
		}

		leia.close();

		System.out.println("\nListar todas as cores: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}

		cores.sort(null);

		System.out.println("\nOrdenar as cores: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
	}

}

package atividades240227;

import java.util.Scanner;

public class A01 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite o valor A: ");
		a = leia.nextInt();
	
		System.out.println("Digite o valor B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = leia.nextInt();
		
		leia.close();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.printf(
					"%d + %d = %d > %d\n"
					+ "A soma de A + B é maior do que C", a, b, soma, c);
		} else if (soma < c) {
			System.out.printf(
					"%d + %d = %d > %d\n"
					+ "A soma de A + B é menor do que C", a, b, soma, c);
		} else {
			System.out.printf(
					"A soma de A + B é igual a C", a, b, soma, c);
		}
	}
}

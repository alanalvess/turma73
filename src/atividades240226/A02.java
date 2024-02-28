package atividades240226;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final double PI = 3.14159;
		double raio, area;
		
		System.out.println("Digite o valor do raio do círculo:");
		raio = leia.nextDouble();
		
		leia.close();
		
		area = PI * (raio*raio);
					
		System.out.printf("\nA área do círculo é: %.2f\n", area);
		
	}
}

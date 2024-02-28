package atividades240223;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float numero1, numero2, numero3, numero4, calculo;
		
		System.out.println("Digite o número 1:");
		numero1 = scanner.nextFloat();

		System.out.println("Digite o número 2:");
		numero2 = scanner.nextFloat();
		
		System.out.println("Digite o número 3:");
		numero3 = scanner.nextFloat();
		
		System.out.println("Digite o número 4:");
		numero4 = scanner.nextFloat();
		
		scanner.close();
		
		calculo= ((numero1 * numero2) - (numero3 * numero4));
		
		System.out.printf("O produto da diferença é: %.2f", calculo);
		
	}
}

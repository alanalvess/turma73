package atividades240223;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, calculo;
		
		System.out.println("Digite a nota 1");
		nota1 = scanner.nextFloat();
		System.out.println("Digite a nota 1");
		nota2 = scanner.nextFloat();
		System.out.println("Digite a nota 1");
		nota3 = scanner.nextFloat();
		System.out.println("Digite a nota 1");
		nota4 = scanner.nextFloat();

		scanner.close();

		calculo = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média de sua neta foi: %.2f", calculo);
		
	}
}

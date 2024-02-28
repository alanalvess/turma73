package atividades240223;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Qual seu salário bruto?");
		salarioBruto = scanner.nextFloat();

		System.out.println("Qual o adicional noturno?");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Quantas hotas extras?");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Quais os descontos?");
		descontos = scanner.nextFloat();
		
		scanner.close();
		
		salarioLiquido= ((salarioBruto + adicionalNoturno) +(horasExtras * 5) - descontos);
		
		System.out.printf("Seu novo salário é: %.2f", salarioLiquido);
		
	}
}

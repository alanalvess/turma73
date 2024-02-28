package atividades240223;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Qual o seu salário?");
		salario = scanner.nextFloat();

		System.out.println("Qual o seu abono?");
		abono = scanner.nextFloat();
		
		scanner.close();
		
		novoSalario = salario +abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
	 	
	}
}

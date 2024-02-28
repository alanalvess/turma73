package atividades240226;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, adicao, subtracao, multiplicacao, divisao;
		
		System.out.println("Digite a variável a:");
		a = leia.nextDouble();
		
		System.out.println("Digite a variável b:");
		b = leia.nextDouble();
		
		leia.close();
		
		adicao = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		divisao = a / b;
			
		if (b>a) {
			System.out.printf("\nA variável B é maior que a variável A\n\n"
					+ "Soma: %.2f\n"
					+ "Subtração: %.2f\n"
					+ "Multiplicação: %.2f\n"
					+ "Divisão: %.3f\n",
					adicao, subtracao, multiplicacao, divisao
			);
			
		}
	}
}

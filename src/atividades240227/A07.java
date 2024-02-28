package atividades240227;

import java.util.Scanner;

public class A07 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String nomeOperacao= "", operador = "";
		int operacao;
		float numero1, numero2, resultado = 0;
		
		System.out.print("Digite o primeiro número:\n_");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número:\n_");
		numero2 = leia.nextFloat();
	
		System.out.println("\nQual operação deseja realizar?\n"
				+ "1- adição\n"
				+ "2- subtração\n"
				+ "3- multiplicação\n"
				+ "4- divisão"
		);
		
		operacao = leia.nextInt();	
		
		leia.close();
		
		switch (operacao) {
		case 1:
			nomeOperacao = "adição";
			resultado = numero1 + numero2;
			operador = "+";
			break;
		case 2:
			nomeOperacao = "subtração";
			resultado = numero1 - numero2;
			operador = "-";
			break;
		case 3:
			nomeOperacao = "multiplicação";
			resultado = numero1 * numero2;
			operador = "*";
			break;
		case 4:
			nomeOperacao = "divisão";
			resultado = numero1 / numero2;
			operador = "/";
			break;
		default:
			System.out.println("\nOperação Inválida!");
		}
		
		if (operacao >= 1 && operacao <= 4) {
			System.out.printf("\nVocê escolheu: %s\n"
					+ "%.2f %s %.2f = %.2f",nomeOperacao, numero1, operador, numero2, resultado
			);
		}
		
	}
}

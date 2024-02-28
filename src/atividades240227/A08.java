package atividades240227;

import java.util.Scanner;

public class A08 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String operacao, nomeOperacao= "";
		float saldo = 1000.0f, valor;
		
		System.out.println("Qual operação deseja realizar?\n"
				+ "1- Saldo\n"
				+ "2- Saque\n"
				+ "3- Depósito\n"
		);
		operacao = leia.next();	
		
		switch (operacao) {
		case "1":
			nomeOperacao = "Saldo";
			System.out.printf("\nOperação - %s \nSaldo: R$ %.2f", nomeOperacao, saldo);
			
			break;
		case "2":
			nomeOperacao = "Saque";
			
			System.out.print("\nDigite o valor de saque: \nR$ ");
			valor = leia.nextFloat();
			
			if (saldo < valor) {
				System.out.printf("\nOperação - %s \nSaldo insuficiente!", nomeOperacao);
			} else {
				saldo -= valor;
				System.out.printf("\nOperação - %s \nSaldo: R$ %.2f", nomeOperacao, saldo);
			}
			
			break;
		case "3":
			nomeOperacao = "Depósito";

			System.out.print("\nDigite o valor de depósito: \nR$ ");
			valor = leia.nextFloat();
			
			saldo += valor;
			System.out.printf("\nOperação - %s \nSaldo: R$ %.2f", nomeOperacao, saldo);
			
			break;
		default:
			System.out.println("\nOperação Inválida!");
		}
		
		leia.close();
		
	}
}

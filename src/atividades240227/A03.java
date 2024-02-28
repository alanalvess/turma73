package atividades240227;

import java.util.Scanner;

public class A03 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doador;
				
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
	
		System.out.printf("%s, qual a sua idade? ", nome);
		idade = leia.nextInt();
		
		System.out.println("Esta é a sua primeira doação?: (true|false) ");
		doador = leia.nextBoolean();
		
		leia.close();
		
		if (idade > 69) {
			System.out.printf("%s não está apto(a) para doar sangue", nome);
		} else if (idade > 60 && doador) {
			System.out.printf("%s não está apto(a) para doar sangue", nome);
		} else if (idade < 18) {
			System.out.printf("%s não está apto(a) para doar sangue", nome);
		} else {
			System.out.printf("%s está apto(a) para doar sangue", nome);
		}
		
	}
}

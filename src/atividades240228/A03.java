package atividades240228;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, menores21 = 0, maiores50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade > 0) {
			
			if (idade < 21) 
				menores21++;
			else if (idade > 50) 
				maiores50++;
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

		}

		System.out.printf("\nTotal de pessoas menores de 21 anos: %d \nTotal de pessoas maiores de 50 anos: %d", menores21, maiores50);

		leia.close();

	}
}

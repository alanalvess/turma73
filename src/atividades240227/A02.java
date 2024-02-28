package atividades240227;

import java.util.Scanner;

public class A02 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
	
		leia.close();
		
		if (numero % 2 == 0) 
			System.out.printf("\nO número %d é par", numero);
		else 
			System.out.printf("\nO número %d é ímpar", numero);
		
		if (numero >= 0)
				System.out.printf(" e positivo!", numero);
		else 
			System.out.printf(" e negativo!", numero);
		
	}
}

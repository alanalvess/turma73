package atividades240226;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		
		System.out.println("Digite um valor");
		valor = leia.nextInt();
		
		leia.close();
		
		nota100 = valor / 100;
		valor %= 100;
		nota50 = valor / 50;
		valor %= 50;
		nota20 = valor / 20;
		valor %= 20;
		nota10 = valor / 10;
		valor %= 10;
		nota5 = valor / 5;
		valor %= 5;
		nota2 = valor / 2;
		valor %= 2;
		nota1 = valor;
		
		System.out.printf("%d notas de R$ 100,00\n", nota100);
		System.out.printf("%d notas de R$ 50,00\n", nota50);
		System.out.printf("%d notas de R$ 20,00\n", nota20);
		System.out.printf("%d notas de R$ 10,00\n", nota10);
		System.out.printf("%d notas de R$ 5,00\n", nota5);
		System.out.printf("%d notas de R$ 2,00\n", nota2);
		System.out.printf("%d notas de R$ 1,00\n", nota1);

	}
}

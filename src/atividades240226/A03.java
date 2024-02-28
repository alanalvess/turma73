package atividades240226;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite um valor");
		tempoSegundos = leia.nextInt();
		
		leia.close();
		
		horas = tempoSegundos / 3600;
		minutos = (tempoSegundos % 3600) / 60;
		segundos = tempoSegundos % 60;
		
		System.out.printf("Valor formatado: %d:%d:%d", horas, minutos, segundos);

	}
}

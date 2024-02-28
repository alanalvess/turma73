package atividades240227;

import java.util.Scanner;

public class A04 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String classificacao, grupo, alimentacao, especie;
				
		System.out.println("Qual a classificação do animal? (vertebrado|invertebrado)");
		classificacao = leia.nextLine();
		
		System.out.println("Ele pertence a qual grupo? (ave|mamífero|inseto|anelídeo) ");
		grupo = leia.nextLine();
	
		System.out.println("Como este animal se alimenta? (carnívoro|onívoro|herbívoro|hematófago)");
		alimentacao = leia.nextLine();
		
		leia.close();
		
		if (classificacao.equalsIgnoreCase("vertebrado")) {
			if (grupo.equalsIgnoreCase("Ave") && alimentacao.equalsIgnoreCase("carnívoro")) {
				System.out.printf("\nÁguia");
			} else if (grupo.equalsIgnoreCase("Ave") && alimentacao.equalsIgnoreCase("onívoro")) {
				System.out.printf("\nPomba");
			} else if (grupo.equalsIgnoreCase("mamífero") && alimentacao.equalsIgnoreCase("onívoro")) {
				System.out.printf("\nHomem");
			} else if (grupo.equalsIgnoreCase("mamífero") && alimentacao.equalsIgnoreCase("herbívoro")) {
				System.out.printf("\nVaca");
			}  
		} else if (classificacao.equalsIgnoreCase("invertebrado")) {
			if (grupo.equalsIgnoreCase("inseto") && alimentacao.equalsIgnoreCase("hematófago")) {
				System.out.printf("\nPulga");
			} else if (grupo.equalsIgnoreCase("inseto") && alimentacao.equalsIgnoreCase("herbívoro")) {
				System.out.printf("\nlagarta");
			} else if (grupo.equalsIgnoreCase("anelídeo") && alimentacao.equalsIgnoreCase("hematófago")) {
				System.out.printf("\nSanguessuga");
			} else if (grupo.equalsIgnoreCase("anelídeo") && alimentacao.equalsIgnoreCase("onívoro")) {
				System.out.printf("\nMinhoca");
			}  
		}
		
	}
}

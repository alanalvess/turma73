package atividades240229;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i, j;
		float notas[][] = new float[10][4];

		System.out.println("Digite as notas de cada aluno (10 alunos, 4 notas por aluno)");
		for (i = 0; i < notas.length; i++) {
			for (j = 0; j < notas[i].length; j++) {
				notas[i][j] = leia.nextFloat();
			}

			System.out.println();
		}

		leia.close();

		System.out.printf("A media de cada aluno é: \n");

		for (i = 0; i < notas.length; i++) {
			float somaLinha = 0, media = 0;

			for (j = 0; j < notas[i].length; j++) {
				somaLinha += notas[i][j];
				media = somaLinha / notas[i].length;
			}

			System.out.printf("| %.1f |", media);
		}
	}
}

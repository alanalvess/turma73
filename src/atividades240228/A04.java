package atividades240228;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String continuar;
		
		int idade = 0, 
				identidadeGenero, 
				pessoaDesenvolvedora, 
				backend = 0, 
				mulheresCisTransFrontend = 0,
				homemCisTransMobile40 = 0, 
				naoBinariosFullstack30 = 0;
		
		float somaIdades = 0, 
				totalPessoas = 0, 
				mediaIdades = 0.0f;

		System.out.println("Deseja continuar: ");
		continuar = leia.next();

		while (continuar.equalsIgnoreCase("s")) {

			System.out.println("Idade: ");
			idade = leia.nextInt();
			somaIdades += idade;
			totalPessoas++;

			System.out.println(
					"Identidade de Gênero:\n"
					+ "1 – Mulher Cis\n" 
					+ "2 – Homem Cis\n" 
					+ "3 – Não Binário\n"
					+ "4 – Mulher Trans\n" 
					+ "5 – Homem Trans\n" 
					+ "6 – Outros\n");
			identidadeGenero = leia.nextInt();

			System.out.println(
					"Pessoa Desenvolvedora:\n" 
					+ "1 – Backend\n" 
					+ "2 – Frontend\n" 
					+ "3 – Mobile\n"
					+ "4 – FullStack\n");
			pessoaDesenvolvedora = leia.nextInt();

			System.out.println("Deseja continuar: ");
			continuar = leia.next();

			if (pessoaDesenvolvedora == 1) {
				backend++;
			} else if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
				mulheresCisTransFrontend++;
			} else if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
				homemCisTransMobile40++;
			} else if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
				naoBinariosFullstack30++;
			}

			mediaIdades = somaIdades / totalPessoas;

		}

		System.out.printf(
				"\nTotal de pessoas desenvolvedoras Backend: %d"
						+ "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: %d"
						+ "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d"
						+ "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d"
						+ "\nO número total de pessoas que responderam à pesquisa: %.2f"
						+ "\nA média de idade das pessoas que responderam à pesquisa: %.2f",
				backend, mulheresCisTransFrontend, homemCisTransMobile40, naoBinariosFullstack30, totalPessoas,
				mediaIdades);

		leia.close();

	}
}

package atividades240227;

import java.util.Scanner;

public class A06 {
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		String cargo= "", nomeColaborador;
		int codigoCargo;
		float salario = 0, reajuste = 0;
		 
				
		System.out.println("Digite o nome do colaborador?");
		nomeColaborador = leia.nextLine();
		
		System.out.println("Digite o código do cargo deste colaborador?");
		codigoCargo = leia.nextInt();
		
		System.out.println("Qual o salario do colaborador?");
		salario = leia.nextFloat();
	
		leia.close();
		
		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Tecnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Código inválido");
		}
		
		salario += salario * reajuste;
		
		
		System.out.printf("\nNome do colaborador: %s\n"
				+ "Cargo: %s\n"
				+ "Salário: R$ %.2f\n", nomeColaborador, cargo, salario);

	}
}

package exSwitchCase;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escolha sua op��o de bebida");
		System.out.println("-----------------------------");

		System.out.println("1- Caf�");
		System.out.println("2- Ch�");
		System.out.println("3- Suco");
		System.out.println("4- Refrigerante");

		System.out.print("Digite a op��o com base no n�mero: ");
		int opcao = scan.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Pegou Caf� !");
			break;
		case 2:
			System.out.println("Pegou ch� !");
			break;
		case 3:
			System.out.println("Pegou suco !");
			break;
		case 4:
			System.out.println("Pegou refrigerante !");
			break;
		default:
			System.out.println("N�mero inv�lido");
			break;
		}

		scan.close();

	}

}

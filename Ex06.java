package exSwitchCase;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escolha sua opção de bebida");
		System.out.println("-----------------------------");

		System.out.println("1- Café");
		System.out.println("2- Chá");
		System.out.println("3- Suco");
		System.out.println("4- Refrigerante");

		System.out.print("Digite a opção com base no número: ");
		int opcao = scan.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Pegou Café !");
			break;
		case 2:
			System.out.println("Pegou chá !");
			break;
		case 3:
			System.out.println("Pegou suco !");
			break;
		case 4:
			System.out.println("Pegou refrigerante !");
			break;
		default:
			System.out.println("Número inválido");
			break;
		}

		scan.close();

	}

}

package exSwitchCase;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um n�mero e veja o dia correspondente: ");
		int diaSemana = leitor.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�mero inv�lido");
			break;
		}

		leitor.close();


	}

}

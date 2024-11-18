package exSwitchCase;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite sua nota e veja sua menção");
		System.out.println("------------------------------------");

		System.out.print("Digite sua nota (0-10): ");
		int nota = leitor.nextInt();

		switch (nota) {

		case 0:
		case 1:
		case 2:
			System.out.println("Menção: F");
			break;
		case 3:
		case 4:
			System.out.println("Menção: D");
			break;
		case 5:
		case 6:
			System.out.println("Menção: C");
			break;
		case 7:
		case 8:
			System.out.println("Menção: B");
			break;
		case 9:
		case 10:
			System.out.println("Menção: A");
			break;
		default:
			System.out.println("Nota inválida");
			break;
			
		}
		
		leitor.close();

	}

}

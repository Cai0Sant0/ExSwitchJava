package exSwitchCase;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite sua nota e veja sua men��o");
		System.out.println("------------------------------------");

		System.out.print("Digite sua nota (0-10): ");
		int nota = leitor.nextInt();

		switch (nota) {

		case 0:
		case 1:
		case 2:
			System.out.println("Men��o: F");
			break;
		case 3:
		case 4:
			System.out.println("Men��o: D");
			break;
		case 5:
		case 6:
			System.out.println("Men��o: C");
			break;
		case 7:
		case 8:
			System.out.println("Men��o: B");
			break;
		case 9:
		case 10:
			System.out.println("Men��o: A");
			break;
		default:
			System.out.println("Nota inv�lida");
			break;
			
		}
		
		leitor.close();

	}

}

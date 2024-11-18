package exSwitchCase;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero e descubra seu fatorial");
		System.out.println("------------------------------------------");
		
		System.out.print("Digite o n�mero: ");
		int num = scan.nextInt();
		int fatorial = 1;
		
		switch(num) {
			
		case 0:
		case 1:
			System.out.println("Fatorial de "+ num+ " � "+fatorial);
			break;
		default:
			for(int i = 2; i <= num; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + num + " � " + fatorial);
			break;
		
		}
		
	
		
		scan.close();
		
	}

}

package exSwitchCase;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções abaixo");
		System.out.println("-------------------------------");
		
		System.out.println("1 -  Exibir olá, mundo!");
		System.out.println("2 -  Exibir bem vindo ao Java!");
		System.out.println("3 - Sair do programa");
		
		System.out.print("Digite o número correspondente a opção desejada: ");
		int escolha = scan.nextInt();
		
		switch(escolha) {
		
		case 1:
			System.out.println("Mensagem escolhida: olá,mundo!");
			break;
		case 2:
			System.out.println("Mensagem escolhida: bem vindo ao Java!");
			break;
		case 3:
			System.out.println("Saindo do programa...");
			break;
			
			
		}
		
		scan.close();
		

	}

}

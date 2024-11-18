package exSwitchCase;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
			
		System.out.println("Digite a classe do filme e veja as faixas etárias dísponiveis");
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("==Opções==");
		System.out.println("G");
		System.out.println("PG");
		System.out.println("PG-13");
		System.out.println("R");
		
		System.out.print("Digite a opção: ");
		String classificacao = leitor.nextLine();
		
		classificacao = classificacao.toLowerCase();
		
		switch(classificacao) {
		
		case "g":
			System.out.println("Classificação Livre");
			break;
		case "pg":
			System.out.println("Maior de 10 anos");
			break;
		case "pg-13":
			System.out.println("Maior de 13 anos");
			break;
		case "r":
			System.out.println("Maior de 18 anos");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		leitor.close();
		
		
	}

}

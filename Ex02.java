package exSwitchCase;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Esreva dois números e a operação que será executada");
		System.out.println("-----------------------------------------------------");

		System.out.print("Digite o primeiro número: ");
		int num01 = leitor.nextInt();

		System.out.print("Digite o segundo número: ");
		int num02 = leitor.nextInt();

		System.out.println(
				"Agora digite a operação a ser executada:  ( adição + , subtração - , divisão /, multiplicação *): ");
		String operador = leitor.next();

		switch (operador) {

		case "+":
			int soma = num01 + num02;
			System.out.println("A soma de " + num01 + " e " + num02 + " é igual a: " + soma);
			break;
		case "-":
			int subtracao = num01 - num02;
			System.out.println("A subtração de " + num01 + " e " + num02 + " é igual a: " + subtracao);
			break;
		case "*":
			int multiplicacao = num01 * num02;
			System.out.println("A multiplicação de " + num01 + " e " + num02 + " é igual a: " + multiplicacao);
			break;
		case "/":
			float divisao = num01 / num02;
			System.out.println("A divisão de " + num01 + " e " + num02 + " é igual a: " + divisao);
			break;
		default:
			System.out.println("[ERRO!!!] Operador inválido");
			break;

		}

		leitor.close();
	}

}

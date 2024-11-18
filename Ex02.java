package exSwitchCase;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Esreva dois n�meros e a opera��o que ser� executada");
		System.out.println("-----------------------------------------------------");

		System.out.print("Digite o primeiro n�mero: ");
		int num01 = leitor.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		int num02 = leitor.nextInt();

		System.out.println(
				"Agora digite a opera��o a ser executada:  ( adi��o + , subtra��o - , divis�o /, multiplica��o *): ");
		String operador = leitor.next();

		switch (operador) {

		case "+":
			int soma = num01 + num02;
			System.out.println("A soma de " + num01 + " e " + num02 + " � igual a: " + soma);
			break;
		case "-":
			int subtracao = num01 - num02;
			System.out.println("A subtra��o de " + num01 + " e " + num02 + " � igual a: " + subtracao);
			break;
		case "*":
			int multiplicacao = num01 * num02;
			System.out.println("A multiplica��o de " + num01 + " e " + num02 + " � igual a: " + multiplicacao);
			break;
		case "/":
			float divisao = num01 / num02;
			System.out.println("A divis�o de " + num01 + " e " + num02 + " � igual a: " + divisao);
			break;
		default:
			System.out.println("[ERRO!!!] Operador inv�lido");
			break;

		}

		leitor.close();
	}

}

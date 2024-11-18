package exSwitchCase;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Escolha qual tipo de convertor de temperatura");
		System.out.println("-----------------------------------------------");

		System.out.println("1 - Graus Celsius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Graus Celsius");

		System.out.print("Escolha a opção: ");
		int opcao = leitor.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Convertor de Graus Celsius para Fahrenheit");
			System.out.println("---------------------------------------------");
			System.out.print("Digite a temperatura em Graus Celsius (°C): ");
			float grausCelsius = leitor.nextFloat();

			float fahrenheit = grausCelsius * 1.8f + 32;

			System.out.printf("Temperatura convertida: %.2f%s", fahrenheit, "°F");

			break;
		case 2:
			System.out.println("Convertor de Fahrenheit para Graus Celsius");
			System.out.println("---------------------------------------------");
			System.out.print("Digite a temperatura em Fahrenheit (°F): ");
			float fahrenheit01 = leitor.nextFloat();

			float grausCelsius01 = (fahrenheit01 - 32) / 1.8f;

			System.out.printf("Temperatura convertida: %.2f%s", grausCelsius01, "°C");

			break;
		default:
			System.out.println("Escolha inválida");
		}

		leitor.close();

	}

}

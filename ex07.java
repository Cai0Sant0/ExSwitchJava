package exSwitchCase;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu salário e veja quanto de imposto vai pagar");
		System.out.println("-----------------------------------------------------------");
		
		System.out.print("Digite seu salário: ");
		float salario = leitor.nextFloat();
		
		float imposto = 0;
		
		if(salario < 1501) {
			imposto = salario*0.05f;
			System.out.printf("Você pagará R$ %.2f%s", imposto, " de imposto");
		}
		
		else if(salario < 3001) {
			imposto = salario*0.1f;
			System.out.printf("Você pagará R$ %.2f%s", imposto, " de imposto");
		}
		
		else {
			imposto = salario*0.15f;
			System.out.printf("Você pagará R$ %.2f%s", imposto, " de imposto");
		}
		
		leitor.close();
		
	}

}

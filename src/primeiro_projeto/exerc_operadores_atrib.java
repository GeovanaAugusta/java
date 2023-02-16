package primeiro_projeto;

import java.util.Scanner;

public class exerc_operadores_atrib {

	public static void main(String[] args) {
		// Plano de 50,00 por 100 min, o que excede é 2 reais o minuto

		double planValue = 50.00;
		int cem = 100;

		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();

		if (minutes > cem) {
			planValue += (2 * (minutes - cem));
		}

		System.out.printf("O valor a pagar é %.2f", planValue);

		sc.close();

	}

}

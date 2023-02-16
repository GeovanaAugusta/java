package primeiro_projeto;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		// if else - normal

		int hora;
		Scanner sc = new Scanner(System.in);
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();

	}

}

package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_constructor;

public class Vetores_price {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		Criar o vetor com n elementos
		Product_constructor[] vect = new Product_constructor[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
//			Atribuo aos produtos o nome e preço
			vect[i] = new Product_constructor(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("AVERAGE PRICE: %.2f%n ", avg);

		sc.close();

	}

}

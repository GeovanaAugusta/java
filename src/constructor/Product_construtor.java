package constructor;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_constructor;

public class Product_construtor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product_constructor product = new Product_constructor(name, price, quantity);

		System.out.println("Product data: " + product.toString());

		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		System.out.println("Updated data: " + product.toString());

		sc.close();

	}

}

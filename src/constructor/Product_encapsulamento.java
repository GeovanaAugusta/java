package constructor;

import java.util.Locale;
import java.util.Scanner;

public class Product_encapsulamento {
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

		entities.Product_encapsulamento product = new entities.Product_encapsulamento(name, price, quantity);
		
//		Muda e recupera o nome do produto
		product.setName("Computer");		
		System.out.println("Updated name: " + product.getName());
		
//		Muda o preço do produto
		product.setPrice(1200.00);		
		System.out.println("Updated price: " + product.getPrice());

		System.out.println("Product data: " + product.toString());

		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		System.out.println("Updated data: " + product.toString());

		sc.close();
	}
}

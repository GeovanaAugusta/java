package entities;

public class Product_constructor {

//	Com o intuito de evitar a existência de produtos sem nome e sem preço - constructor	
//	Refact Product (entities) e Product_poo

	public String name;
	public double price;
	public int quantity;

	public Product_constructor(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
//	Mais de uma versão da mesma operação - sobrecarga	
	public Product_constructor(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
//	Mais de uma versão da mesma operação - sobrecarga	
	public Product_constructor() {}

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quant) {
		quantity = quantity + quant;
	}

	public void removeProducts(int quant) {
		quantity = quantity - quant;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueStock());
	}

}

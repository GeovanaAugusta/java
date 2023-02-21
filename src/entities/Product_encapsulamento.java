package entities;

public class Product_encapsulamento {

	private String name;
	private double price;
	private int quantity;

	public Product_encapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

//	Mais de uma versão da mesma operação - sobrecarga	
	public Product_encapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
	}

//	constructor padrão
	public Product_encapsulamento() {}
	
//	Depois dos construtores
	public void setName(String name)  {
		this.name = name;
	}
	
	public String getName()  {
		return this.name;
	}
	
	public void setPrice(double price)  {
		this.price = price;
	}
	
	public double getPrice()  {
		return this.price;
	}	
	
//	Apenas leitura para proteção de dados
	public int getQuantity()  {
		return this.quantity;
	}	
	

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

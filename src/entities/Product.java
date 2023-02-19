package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
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
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueStock());
}
}

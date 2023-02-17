package primeiro_projeto;

public class Condicional_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preco = 34.50;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

	}

}

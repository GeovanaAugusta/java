package primeiro_projeto;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// Scanner -> processamento de dados ou casting (entrada)
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		char z;
//		Entrada de dados na mesma linha separado por espaços
		x = sc.next();
		y = sc.nextInt();
		z = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);		
		System.out.println("Você digitou: " + y);		
		System.out.println("Você digitou: " + z);
		
		System.out.println(x);		
		System.out.println(y);		
		System.out.println(z);
			
	
		
		
		sc.close();

	}

}

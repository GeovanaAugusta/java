package primeiro_projeto;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		Scanner sc2 = new Scanner(System.in);
		int y;
		y = sc2.nextInt();
		System.out.println("Você digitou: " + y);
		
		sc.close();

	}

}

package primeiro_projeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	
		
		int heigher = max(a, b, c);
		
		showResult(heigher);
			
		
		sc.close(); 	

	}
	
	public static int max(int a, int b, int c) {
		
		int aux = 0;
		
		if (a > b &&  a > c) {
			aux = a;
		}
		else if (b > a &&  b > c) {
			aux = b;		
		} else {
			aux = c;
		}	
		
		return aux;
	}
	
	public static void showResult(int heigher) {
		System.out.println("Higher = " + heigher);
	}

}

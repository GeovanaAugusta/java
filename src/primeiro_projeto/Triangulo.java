package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Sides_triangle;

public class Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			Sides_triangle x, y;
			x = new Sides_triangle();
			y = new Sides_triangle();

			System.out.println("Enter the measures of triangle X: ");

			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();

			System.out.println("Enter the measures of triangle Y: ");

			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = x.area();
			
			double areaY = y.area();
			
			System.out.printf("Triangle Y area: %f%n", areaX);			
			System.out.printf("Triangle Y area: %f%n", areaY);
			
			
			if (areaX > areaY) {
				System.out.println("Larger area: X");
			} else {
				System.out.println("Larger area: Y");
			}
			
			sc.close();
		}

	}

}

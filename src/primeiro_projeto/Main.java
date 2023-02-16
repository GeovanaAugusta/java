package primeiro_projeto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

// first conceits

public class Main {
	
	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
	    String formattedPrice1 = decimalFormat.format(price1);
		
		DecimalFormat decimalFormat2 = new DecimalFormat("#,##0.00");
	    String formattedPrice2 = decimalFormat2.format(price2);
	    
	    DecimalFormat decimalFormat8 = new DecimalFormat("#,##0.00000000");
        String formattedMeasure8 = decimalFormat8.format(measure);
	    
	    DecimalFormat decimalFormat3 = new DecimalFormat("#,##0.000");
        String formattedMeasure3 = decimalFormat3.format(measure);

        String formattedMeasure = NumberFormat.getInstance().format(BigDecimal.valueOf(measure).setScale(3, RoundingMode.HALF_UP));
        System.out.println(formattedMeasure);
		
		System.out.println("Hello World");
		Locale.setDefault(Locale.US);
		System.out.println(x);
		
		// double round.
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
//		Concatenation and % for each type
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.printf("Products: %s, wich price is %s %n%s, wich price is %s%n", product1, formattedPrice1, product2, formattedPrice2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measy with eight decimal places: %s%n", formattedMeasure8);
		System.out.printf("Rouded (three decimal places): %s%n", formattedMeasure3);
		System.out.printf("US decimal pointer: %.3f%n", measure);
	}

}

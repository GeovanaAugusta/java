package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
//		Declarar Lista		
		List<String> list = new ArrayList<>();
		
//		Adição em Lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
//		Adiciona na posição 2
		list.add(2, "Marco");
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
//		Filtra os nomes que começam com A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
//		Encontra o primeiro nome que começa com J - Predicato específico
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}

}

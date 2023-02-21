package vetores;

public class For_each {

	public static void main(String[] args) {
		
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
//		Equivalência
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}

package collections_java;

import java.util.Vector;

public class ExVector {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.add("Amora");
		vector.add("Banana");
		vector.add("Amora"); // Duplicado permitido
		System.out.println(vector);
	}
}

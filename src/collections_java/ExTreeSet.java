package collections_java;

import java.util.TreeSet;

public class ExTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Amora"); // Duplicado não permitido
		System.out.println(set);
	}
}

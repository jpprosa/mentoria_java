package collections_java;

import java.util.TreeMap;

public class ExTreeMap {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Amora", 1);
		map.put("Banana", 2);
		map.put("Amora", 3); // Duplicado substitui o valor anterior
		System.out.println(map);
	}
}

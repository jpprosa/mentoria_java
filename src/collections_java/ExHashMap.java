package collections_java;

import java.util.HashMap;

public class ExHashMap {
	
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Amora", 1);
        map.put("Banana", 2);
        map.put("Amora", 3); // Duplicado substitui o valor anterior
        System.out.println(map);
    }
}

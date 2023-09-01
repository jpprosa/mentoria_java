package collections_java;

import java.util.LinkedHashMap;

public class ExLinkedHashMap {
	
	public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Amora", 1);
        map.put("Banana", 2);
        map.put("Amora", 3); // Duplicado substitui o valor anterior
        System.out.println(map);
    }
}

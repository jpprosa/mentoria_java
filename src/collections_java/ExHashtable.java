package collections_java;

import java.util.Hashtable;

public class ExHashtable {
	
	public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Amora", 1);
        table.put("Banana", 2);
        table.put("Amora", 3); // Duplicado substitui o valor anterior
        System.out.println(table);
    }
}

package collections_java;

import java.util.HashSet;

public class ExHashSet {
	
	public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Amora");
        set.add("Banana");
        set.add("Amora"); // Duplicado não permitido
        System.out.println(set);
    }
}

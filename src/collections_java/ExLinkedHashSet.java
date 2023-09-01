package collections_java;

import java.util.LinkedHashSet;

public class ExLinkedHashSet {
	
	public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Amora");
        set.add("Banana");
        set.add("Amora"); // Duplicado não permitido
        System.out.println(set);
    }
}

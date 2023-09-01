package collections_java;

import java.util.LinkedList;

public class ExLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Amora");
		list.add("Banana");
		list.add("Amora"); // Duplicado permitido
		System.out.println(list);
		
	}
}

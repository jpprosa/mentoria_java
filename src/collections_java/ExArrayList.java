package collections_java;

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Amora");
        list.add("Banana");
        list.add("Amora"); // Duplicado permitido
        System.out.println(list);
    }
}

package collections_java;

import java.util.ArrayDeque;

public class ExArrayDeque {
	
	public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.addFirst("First");
        ad.addLast("Last");
        System.out.println(ad);
    }
}

package collections_java;

import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
	
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("AMora");
        queue.add("Banana");
        queue.add("Amora"); // Duplicado permitido
        System.out.println(queue);
    }
}

package collections_java;

import java.util.PriorityQueue;

public class ExPriorityQueue {
	
	public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq);
    }
}

package com.penukondah1.Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> q = new PriorityQueue<String>(new MyComparator1());
		
		q.offer("B");
		q.offer("A");
		q.offer("E");
		q.offer("D");
		q.offer("F");
		q.offer("C");
		q.offer("G");
		
		System.out.println(q); // [G, E, F, A, D, B, C]

	}

}

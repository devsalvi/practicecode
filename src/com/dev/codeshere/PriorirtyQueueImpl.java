package com.dev.codeshere;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorirtyQueueImpl {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	for(int i=0; i < 20; i++) {
		pq.offer((int) (Math.random()*99));
	}
	System.out.println(pq);
	
	for(int i=0; i< 20; i++) {
		System.out.println(pq.poll());
	}
	
	
	pq = new PriorityQueue<>(new IntComparator());
	for(int i=0; i < 20; i++) {
		pq.offer((int) (Math.random()*99));
	}
	System.out.println(pq);
	for(int i=0; i< 20; i++) {
		System.out.println(pq.poll());
	}
}

static class IntComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}
}

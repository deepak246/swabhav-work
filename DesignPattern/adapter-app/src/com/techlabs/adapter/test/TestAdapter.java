package com.techlabs.adapter.test;

import java.util.Iterator;

import com.techlabs.adapter.IQueue;
import com.techlabs.adapter.QueueAdapter;

public class TestAdapter {

	public static void main(String[] args) {
		IQueue<Integer> queue = new QueueAdapter<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.count());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		for(int item : queue) {
			System.out.println(item);
		}
	}

}

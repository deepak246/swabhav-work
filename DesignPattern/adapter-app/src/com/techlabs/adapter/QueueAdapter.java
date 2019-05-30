package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue{
	private LinkedList<T> q;
	
	public QueueAdapter() {
		q = new LinkedList<T>();
	}

	@Override
	public void enqueue(Object item) {
		q.addLast((T) item);
	}

	@Override
	public Object dequeue() {
		return q.removeFirst();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return q.size();
	}

	public LinkedList<T> getQ() {
		return q;
	}

	@Override
	public Iterator iterator() {
		return q.iterator();
	}
	
	
}

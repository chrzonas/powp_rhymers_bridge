package edu.kis.vh.nursery.stacklist;

import edu.kis.vh.nursery.Adapter;

public class IntLinkedList extends Adapter {

	public IntLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Node last;
	private int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.value;
	}
	
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	@Override
	public int getI() {
		return i;
	}

	Node getLast() {
		return last;
	}
}

class Node {

	protected int value;
	protected Node prev, next;

	protected Node(final int i) {
		value = i;
	}
}

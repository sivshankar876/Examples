package com.siva.examples;
public class Link {

	private int value = 0;
	private Link next = null;

	Link(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
}

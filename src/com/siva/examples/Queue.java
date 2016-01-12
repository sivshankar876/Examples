package com.siva.examples;
public class Queue {

	Link startOfQueue = null;
	Link endOfQueue = null;

	public boolean enqueue(Link link) {

		link.setNext(null);

		if (endOfQueue == null) {

			startOfQueue = link;
			endOfQueue = link;

		} else {

			endOfQueue.setNext(link);
			endOfQueue = endOfQueue.getNext();
		}
		return true;
	}

	public Link dequeue() {

		Link returnLink = startOfQueue;

		if (startOfQueue != null)
			startOfQueue.setNext(startOfQueue.getNext());

		return returnLink;
	}

	public void printAllElements() {
		Link currentPointer = startOfQueue;

		while (currentPointer != null) {
			System.out.println("Current pointer value - "
					+ currentPointer.getValue());

			currentPointer = currentPointer.getNext();
		}
	}

	public void printStartAndEnd() {
		System.out.println("Start Pointer - " + startOfQueue.getValue());
		System.out.println("End Pointer - " + endOfQueue.getValue());
	}

	public static void main(String args[]) {

		Queue Q1 = new Queue();

		Q1.enqueue(new Link(1));
		Q1.printStartAndEnd();

		Q1.enqueue(new Link(2));
		Q1.printStartAndEnd();

		Q1.enqueue(new Link(3));
		Q1.printStartAndEnd();

		Q1.enqueue(new Link(4));
		Q1.printStartAndEnd();

		Q1.printAllElements();

	}
}

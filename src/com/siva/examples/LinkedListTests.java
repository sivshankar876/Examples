package com.siva.examples;
import org.junit.Test;

public class LinkedListTests {

	// @Test
	public void testPrintAllElements() {

		LinkedList list = new LinkedList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		list.printAllElements();
	}

	// @Test
	public void testIsLooped() {

		LinkedList list2 = new LinkedList();
		Link l1 = new Link(1);
		Link l2 = new Link(2);
		Link l3 = new Link(3);
		Link l4 = new Link(4);
		Link l5 = new Link(5);

		list2.add(l1);
		list2.add(l2);
		list2.add(l3);
		list2.add(l4);
		list2.add(l5);

		l1.setNext(l5);
		// list2.printAllElements();

		System.out.println("List looped boolean : " + list2.isLooped());
	}

//	@Test
	public void testDeleteElementAtIndex() {
		LinkedList list2 = new LinkedList();

		list2.add(5);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		list2.add(1);

		System.out.println("Before Deletion : \n");
		list2.printAllElements();

		list2.deleteLinkAtIndex(1);
		
		System.out.println("\nAfter Deletion : \n");
		list2.printAllElements();
	}
	
	@Test
	public void testInsertElementAtIndex() {
		LinkedList list2 = new LinkedList();

		list2.add(5);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		list2.add(1);

		System.out.println("Before Insertion : \n");
		list2.printAllElements();

		list2.insertElementAtIndex(new Link(10), 10);
		
		System.out.println("\nAfter Deletion : \n");
		list2.printAllElements();
	}
}

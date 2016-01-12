package com.siva.examples;
public class TreeTest {
	public static void main(String args[]) {
		Tree testTree = new Tree();

		testTree.addNode(10);
		// System.out.println("Adding " + 10 + ". Root node is: "
		// + testTree.getRootNode());

		testTree.addNode(8);
		// System.out.println("Adding " + 8 + ". Root node is: "
		// + testTree.getRootNode());

		testTree.addNode(20);
		// System.out.println("Adding " + 20 + ". Root node is: "
		// + testTree.getRootNode());

		testTree.addNode(13);
		// System.out.println("Adding " + 13 + ". Root node is: "
		// + testTree.getRootNode());

		testTree.addNode(25);
		// System.out.println("Adding " + 25 + ". Root node is: "
		// + testTree.getRootNode());

		Tree test2 = new Tree();
		test2.addNode(30);
		test2.addNode(20);
		test2.addNode(10);
		test2.addNode(40);
		test2.addNode(50);
		test2.addNode(15);
		test2.addNode(5);
		test2.addNode(6);
		test2.addNode(7);
		test2.addNode(8);

		test2.addNode(31);
		test2.addNode(32);
		test2.addNode(33);
		test2.addNode(34);
		test2.addNode(35);
		test2.addNode(36);
		test2.addNode(37);
		test2.addNode(38);

		System.out.println(testTree.getLeafNodes(test2.getRootNode()));

		System.out.println("Depth is - "
				+ test2.getDepth(test2.getRootNode(), 31, 0));
		System.out.println("Max Depth is - " + test2.getMaxDepth());

	}
}

package com.siva.examples;
public class Node {

	private int value = 0;
	private Node leftNode = null;
	private Node rightNode = null;

	Node(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(Node rightNode){
		this.rightNode = rightNode;
	}
	
	public void setLeftNode(Node leftNode){
		this.leftNode = leftNode;
	}
}

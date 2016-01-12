package com.siva.examples;
import java.util.ArrayList;
import java.util.List;

public class Tree {

	private Node rootNode = null;
	private List<Node> listOfLeafNodes = new ArrayList<Node>();

	public Tree() {
	}

	public Tree(Node node) {
		rootNode = node;
	}

	public int getRootNodeValue() {
		return rootNode.getValue();
	}

	public Node getRootNode() {
		return rootNode;
	}

	public boolean addNode(Node node) {

		if (this.rootNode == null) {
			rootNode = node;
			return true;
		} else {

			if (rootNode.getValue() == node.getValue()) {
				System.out.println("Node exists");
				return false;
			}

			if (rootNode.getRightNode() == null
					&& node.getValue() < rootNode.getValue())
				rootNode.setRightNode(node);
			else if (rootNode.getRightNode() != null
					&& node.getValue() < rootNode.getValue())
				new Tree(rootNode.getRightNode()).addNode(node);

			if (rootNode.getLeftNode() == null
					&& node.getValue() > rootNode.getValue())
				rootNode.setLeftNode(node);
			else if (rootNode.getLeftNode() != null
					&& node.getValue() > rootNode.getValue())
				new Tree(rootNode.getLeftNode()).addNode(node);

			else
				return false;
		}
		return true;
	}

	public boolean addNode(int value) {
		return addNode(new Node(value));
	}

	public int getHeight(Node rootNode, int count) {

		if (rootNode == null)
			return 0;

		else if (rootNode.getRightNode() == null
				&& rootNode.getLeftNode() == null) {
			System.out
					.println("Final root node ending: " + rootNode.getValue());
			return 1 + count;
		}
		if (rootNode.getRightNode() != null) {
			System.out.println("Considering - " + rootNode.getValue());
			return 1 + getHeight(rootNode.getRightNode(), count);
		}

		if (rootNode.getLeftNode() != null) {
			System.out.println("Considering - " + rootNode.getValue());
			return 1 + getHeight(rootNode.getLeftNode(), count);
		} else
			return 0;
	}

	public int getLeafNodes(Node rootNode) {

		if (rootNode == null)
			return 0;
		else if (rootNode.getRightNode() == null
				&& rootNode.getLeftNode() == null) {
			System.out.println("Considering node - " + rootNode.getValue()
					+ ". This is a leaf node.");

			listOfLeafNodes.add(rootNode);

			return 1;
		} else if (rootNode.getRightNode() != null
				&& rootNode.getLeftNode() == null) {
			System.out
					.println("Considering node - "
							+ rootNode.getValue()
							+ ". This is a node with left element as null. Right Node value is "
							+ rootNode.getRightNode().getValue());
			return getLeafNodes(rootNode.getRightNode());
		} else if (rootNode.getLeftNode() != null
				&& rootNode.getRightNode() == null) {
			System.out
					.println("Considering node - "
							+ rootNode.getValue()
							+ ". This is a node with right element null. Left Node value is "
							+ rootNode.getLeftNode().getValue());
			return getLeafNodes(rootNode.getLeftNode());

		} else {
			System.out
					.println("Considering node - "
							+ rootNode.getValue()
							+ ". This is a node with both elements. Right and Left Node values are "
							+ rootNode.getRightNode().getValue() + " and "
							+ rootNode.getLeftNode().getValue());

			return getLeafNodes(rootNode.getRightNode())
					+ getLeafNodes(rootNode.getLeftNode());
		}
	}

	public int getMaxDepth() {
		int maxDepth = 0;

		if (listOfLeafNodes.isEmpty()) {
			getLeafNodes(this.rootNode);
			for (int i = 0; i < listOfLeafNodes.size(); i++) {
				System.out.println("Leaf Node : "
						+ listOfLeafNodes.get(i).getValue());
			}
		}
		for (int i = 0; i < listOfLeafNodes.size(); i++) {
			int depth = getDepth(rootNode, listOfLeafNodes.get(i).getValue(), 0);

			System.out.println("Depth of " + listOfLeafNodes.get(i).getValue()
					+ " is " + depth);

			if (depth > maxDepth)
				maxDepth = depth;
		}
		return maxDepth;
	}

	public int getDepth(Node rootNode, int value, int previousCount) {

		if (rootNode == null)
			return 0;
		else if (rootNode.getValue() == value)
			return 1 + previousCount;
		else if (rootNode.getValue() > value)
			return getDepth(rootNode.getRightNode(), value, previousCount + 1);
		else
			return getDepth(rootNode.getLeftNode(), value, previousCount + 1);
	}

	public boolean printInOrderTraversal() {

		if (this.rootNode == null)
			return false;

		else {
			new Tree(rootNode.getRightNode()).printInOrderTraversal();
			System.out.println("Iterating node: " + rootNode.getValue());
			new Tree(rootNode.getLeftNode()).printInOrderTraversal();
		}
		return true;
	}
}

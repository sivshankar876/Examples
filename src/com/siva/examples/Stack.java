package com.siva.examples;
public class Stack {

	private LinkedList memStack = new LinkedList();
	Link topOfStack = null;

	public boolean push(Link link) {

		memStack.add(link);
		topOfStack = memStack.getHeadLink();

		return true;
	}

	public Link pop() {

		if (memStack == null || memStack.getHeadLink() == null)
			return null;

		Link tempValue = memStack.getHeadLink();
		memStack.setHeadLink(memStack.getHeadLink().getNext());

		topOfStack = memStack.getHeadLink();
		return tempValue;
	}

	public static void main(String args[]) {

		Stack stack = new Stack();
		stack.push(new Link(5));
		stack.push(new Link(4));
		stack.push(new Link(3));
		stack.push(new Link(2));
		stack.push(new Link(1));

		System.out.println(stack.pop().getValue());
		System.out.println(stack.pop().getValue());
		System.out.println(stack.pop().getValue());

	}
}

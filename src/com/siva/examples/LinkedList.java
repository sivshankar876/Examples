package com.siva.examples;
public class LinkedList {

	private Link headLink = null;

	public Link getHeadLink() {
		return headLink;
	}

	public boolean setHeadLink(Link link) {

		link.setNext(headLink);
		headLink = link;

		return true;
	}

	LinkedList(Link link) {
		headLink = link;
	}

	LinkedList(int value) {
		headLink = new Link(value);
	}

	LinkedList() {

	}

	public LinkedList add(int value) {
		Link link = new Link(value);

		if (this.headLink == null) {
			headLink = link;
		} else {
			link.setNext(headLink);
			headLink = link;
		}
		return this;
	}

	public LinkedList add(Link link) {

		if (link != null) {
			if (this.headLink == null) {
				headLink = link;
			} else {
				link.setNext(headLink);
				headLink = link;
			}
		}
		return this;
	}

	public boolean isLooped() {

		if (headLink == null || headLink.getNext() == null)
			return false;
		else {

			Link slowPointer = headLink;
			Link fastPointer = headLink.getNext();

			while (true) {

				if (fastPointer == null || fastPointer.getNext() == null) {
					return false;
				} else if (fastPointer == slowPointer) {
					return true;
				} else {
					slowPointer = slowPointer.getNext();
					fastPointer = fastPointer.getNext().getNext();
				}
			}
		}
	}

	public void printAllElements() {
		if (headLink != null) {
			Link currentLink = headLink;
			do {

				System.out.println(currentLink.getValue());
				currentLink = currentLink.getNext();

			} while (currentLink != null);
		}
		else
			System.out.println("List is null");
	}

	public LinkedList reverseList() {

		if (this == null || this.headLink == null
				|| this.headLink.getNext() == null)
			return this;
		else {
			Link firstPointer = this.headLink;
			Link nextPointer = this.headLink.getNext();

			firstPointer.setNext(null);

			while (nextPointer != null) {
				Link temp = nextPointer.getNext();
				nextPointer.setNext(firstPointer);

				firstPointer = nextPointer;
				nextPointer = temp;

				if (nextPointer != null)
					this.headLink = nextPointer;
			}
		}
		return this;
	}

	public LinkedList deleteLinkAtIndex(int index) {

		if (this == null || this.headLink == null || index < 0)
			return this;

		Link currentPointer = this.headLink;

		if (index == 0) {
			headLink = headLink.getNext();
		} else {

			for (int i = 0; i < index - 1; i++) {
				if (currentPointer.getNext() != null)
					currentPointer = currentPointer.getNext();
				else {
					return this;
				}
			}
			if (currentPointer.getNext() != null)
				currentPointer.setNext(currentPointer.getNext().getNext());
		}

		return this;
	}

	public LinkedList insertElementAtIndex(Link link, int index) {

		if (this == null || this.headLink == null || link == null || index < 0)
			return this;

		Link currentPointer = this.headLink;

		if (index == 0) {

			link.setNext(currentPointer);
			this.headLink = link;

		} else {

			for (int i = 0; i < index - 1; i++) {
				if (currentPointer.getNext() != null)
					currentPointer = currentPointer.getNext();

				else {

					link.setNext(currentPointer.getNext());
					currentPointer.setNext(link);

					return this;
				}
			}

			link.setNext(currentPointer.getNext());
			currentPointer.setNext(link);
		}

		return this;
	}

	public LinkedList reverseListByRecursion(LinkedList list) {

		if (this == null || this.headLink == null
				|| this.headLink.getNext() == null)
			return this;
		else {
			Link firstPointer = this.headLink;
			Link nextPointer = this.headLink.getNext();

			firstPointer.setNext(null);

			while (nextPointer != null) {
				Link temp = nextPointer.getNext();
				nextPointer.setNext(firstPointer);

				firstPointer = nextPointer;
				nextPointer = temp;

				if (nextPointer != null)
					this.headLink = nextPointer;
			}
		}
		return this;
	}

	public LinkedList deleteLinkByLink(int index) {

		if (this == null || this.headLink == null || index < 0)
			return this;

		Link currentPointer = this.headLink;

		if (index == 0) {
			headLink = headLink.getNext();
		} else {

			for (int i = 0; i < index - 1; i++) {
				if (currentPointer.getNext() != null)
					currentPointer = currentPointer.getNext();
				else {
					return this;
				}
			}
			if (currentPointer.getNext() != null)
				currentPointer.setNext(currentPointer.getNext().getNext());
		}

		return this;
	}

}

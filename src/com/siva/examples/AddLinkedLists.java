package com.siva.examples;
public class AddLinkedLists {

	public static void main(String args[]) {

		LinkedList list1 = new LinkedList();
		list1.add(9);
		list1.add(9);
		list1.add(9);

		LinkedList list2 = new LinkedList();
		list2.add(1);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);

		LinkedList resultList = new LinkedList();

		Link firstListPointer = list1.getHeadLink();
		Link secondListPointer = list2.getHeadLink();
		Link thirdListPointer = resultList.getHeadLink();

		boolean carryOver = false;

		while (firstListPointer != null && secondListPointer != null) {
			int sum = firstListPointer.getValue()
					+ secondListPointer.getValue();
			if (carryOver) {
				sum = sum + 1;
				carryOver = false;
			}

			if (sum >= 10) {
				carryOver = true;
				sum = sum - 10;
			}

			if (thirdListPointer == null) {
				resultList.add(sum);
				thirdListPointer = resultList.getHeadLink();
			} else {
				thirdListPointer.setNext(new Link(sum));
				thirdListPointer = thirdListPointer.getNext();
			}

			firstListPointer = firstListPointer.getNext();
			secondListPointer = secondListPointer.getNext();
		}

		if (firstListPointer == null) {
			while (secondListPointer != null) {
				int sum = secondListPointer.getValue();
				if (carryOver) {
					sum = sum + 1;
					carryOver = false;
				}

				if (sum > 10) {
					carryOver = true;
					sum = sum - 10;
				}

				if (thirdListPointer == null)
					thirdListPointer = new Link(sum);
				else {
					thirdListPointer.setNext(new Link(sum));
					thirdListPointer = thirdListPointer.getNext();
				}

				secondListPointer = secondListPointer.getNext();
			}
		} else if (secondListPointer == null) {
			while (firstListPointer != null) {
				int sum = firstListPointer.getValue();
				if (carryOver) {
					sum = sum + 1;
					carryOver = false;
				}

				if (sum > 10) {
					carryOver = true;
					sum = sum - 10;
				}

				if (thirdListPointer == null)
					thirdListPointer = new Link(sum);
				else {
					thirdListPointer.setNext(new Link(sum));
					thirdListPointer = thirdListPointer.getNext();
				}
				firstListPointer = firstListPointer.getNext();
			}
		}

		if (carryOver) {
			thirdListPointer.setNext(new Link(1));
			thirdListPointer = thirdListPointer.getNext();
		}

		resultList.printAllElements();
	}
}

package com.siva.examples;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Heap {

	Node rootNode;

	public static void main(String args[]) {

		List<String> array = new ArrayList<String>();
		System.out.println(array.size());

	}

	public void getInteger(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		boolean isNegative = false;
		int stopIndex = 0;
		if (str.charAt(0) == '1') {
			isNegative = true;
			stopIndex = 1;
		}

	}
}

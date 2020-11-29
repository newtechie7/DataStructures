package com.ds.list.test;

import com.ds.list.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.add(200);
		linkedList.add(400);
		linkedList.add(500);
		linkedList.add(100);
		linkedList.add(700);

		linkedList.printAllAccountNumbersFromList();

	}

}

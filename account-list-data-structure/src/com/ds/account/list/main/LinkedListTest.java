package com.ds.account.list.main;

import com.ds.account.list.LinkedList;
import com.ds.account.list.data.Account;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.add(new Account(100, "Anil"));
		linkedList.add(new Account(200, "Bharat"));
		linkedList.add(new Account(300, "Charan"));
		linkedList.add(new Account(400, "Dharan"));
		linkedList.add(new Account(500, "Eric"));

		linkedList.printAllAccountObjcetsFromList();

	}

}

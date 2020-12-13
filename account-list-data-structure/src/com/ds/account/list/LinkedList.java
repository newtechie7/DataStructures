package com.ds.account.list;

import com.ds.account.list.data.Account;

class Node {

	Account data;
	Node next;

	public Node(Account data) {
		this.data = data;
	}

}

public class LinkedList {

	// Head/Root/Parent node of Linked List
	Node head;

	public void add(Account data) {

		// Create newNode to store in Linked List
		Node newNode = new Node(data);

		if (head == null) {
			// head is null means, Linked list is not created

			// Create Linked list by assigning newNode to head
			head = newNode;

		} else {

			Node currentNode = head;

			while (currentNode.next != null) {
				// currentNode.next is not null means, next node exist in Linked
				// list

				// Move currentNode to next node
				currentNode = currentNode.next;
			}

			// while loop end means, currentNode is at last node

			// Adding newNode at the end of the list
			currentNode.next = newNode;
		}

	}
	
	
	public void printAllAccountObjcetsFromList() {

		Node currentNode = head;

		if (currentNode != null) {
			// currentNode is not null means, Linked list created and has
			// Account objects

			do {
				// As currentNode has data, print it
				System.out.println(currentNode.data.toString());

				// After printing currentNode data, move to next node
				currentNode = currentNode.next;

				// currentNode is not null means, next node exist so loop
				// continues
			} while (currentNode != null);

			// end of while loop means all the account objects from list printed

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

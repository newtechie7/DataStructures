package com.ds.list;

class Node {

	int accountNumber;
	Node next;

	public Node(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}

public class LinkedList {

	private Node head;

	/**
	 * This method creates Linked List if not created already and adds given
	 * accountNumber to LinkedList
	 * 
	 * @param accountNumber
	 */
	public void add(int accountNumber) {

		// Create new node with given accountNumber
		Node newNode = new Node(accountNumber);

		if (head == null) {
			// head is null means, Linked List not created so create Linked List
			// by assigning newNode to head

			head = newNode;

		} else {
			// head is not null means, Linked List already created so add
			// newNode at the end of Linked List by traversing till end by using
			// head

			Node currentNode = head;

			while (currentNode.next != null) {
				// currentNode.next is not null means, next node is there so
				// goto next node

				// Move to next node
				currentNode = currentNode.next;
			}
			// After while loop means, currentNode points to last node so add
			// newNode
			// to currentNode next
			currentNode.next = newNode;

		}

		// End of add method
	}

	public void printAllAccountNumbersFromList() {

		if (head != null) {
			// head is not null means, Linked list has account number(s)

			Node currentNode = head;

			do {

				// Print currentNode account number
				System.out.println(currentNode.accountNumber);

				// currentNode to next node
				currentNode = currentNode.next;

				// currentNode not null means, next node exist so loop continues
			} while (currentNode != null);

			// end of while loop means Linked List traversed completely and
			// printed all account number(S)
		}

	}

}

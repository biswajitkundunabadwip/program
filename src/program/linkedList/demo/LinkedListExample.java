package program.linkedList.demo;

public class LinkedListExample {
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void addNodeAtBegining(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
			// case when there happens to be a head already
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addNodeIndex(int val, int index) {
		int count = 1;
		Node current = head;

		while (current != null && (count != index - 1)) {
			current = current.next;
			count++;
		}
		Node newNode = new Node(val);
		Node temp = current.next;
		current.next = newNode;
		newNode.next = temp;
	}

	public boolean checkElementPresentInList(int val) {
		Node current = head;
		while (current != null) {
			if (current.value == val) {
				return true;
			}
			current = current.next;
		}
		return false;
	}



	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedListExample lnkdlist = new LinkedListExample();
		lnkdlist.addNodeAtEnd(10);
		lnkdlist.addNodeAtEnd(20);
		lnkdlist.addNodeAtEnd(30);
		lnkdlist.addNodeAtEnd(40);
		lnkdlist.addNodeAtEnd(50);
//		lnkdlist.addNodeAtBegining(1);
		lnkdlist.printLinkedList(head);
		System.out.println(lnkdlist.checkElementPresentInList(10));
		lnkdlist.addNodeIndex(75, 3);
		lnkdlist.printLinkedList(head);
	}
}

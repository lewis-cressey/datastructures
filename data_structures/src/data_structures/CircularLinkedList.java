package data_structures;

public class CircularLinkedList {
	private int value;
	private CircularLinkedList next;
	private CircularLinkedList prev;
	
	CircularLinkedList(int value) {
		this.value = value;
		this.next = this;
		this.prev = this;
	}
	
	CircularLinkedList insertBefore(int value) {
		return this.prev.insertAfter(value);
	}
	
	CircularLinkedList insertAfter(int value) {
		CircularLinkedList newElement = new CircularLinkedList(value);
		newElement.next = this.next;
		newElement.prev = this;
		this.next = newElement;
		newElement.next.prev = newElement;
		return newElement;
	}
	
	public String toString() {
		CircularLinkedList start = this;
		String text = Integer.toString(value);
		CircularLinkedList node = this.next;
		while (node != start) {
			text += "," + Integer.toString(node.value);
			node = node.next;
		}
		return text;
	}
}

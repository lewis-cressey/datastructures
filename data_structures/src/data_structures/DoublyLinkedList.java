package data_structures;

public class DoublyLinkedList {
	private int value;
	private DoublyLinkedList next;
	private DoublyLinkedList prev;
	
	DoublyLinkedList(int value, DoublyLinkedList next, DoublyLinkedList prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	void insertAfter(DoublyLinkedList element) {
		// todo
	}
	
	public String toString() {
		String text = Integer.toString(value);
		if (next != null) {
			text = next.toString() + "," + text;
		}
		return text;
	}
}

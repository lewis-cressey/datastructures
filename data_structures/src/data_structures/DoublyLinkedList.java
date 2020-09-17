package data_structures;

public class DoublyLinkedList {
	private int value;
	private DoublyLinkedList next;
	private DoublyLinkedList prev;
	
	DoublyLinkedList(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	DoublyLinkedList insertAfter(DoublyLinkedList element) {
		DoublyLinkedList newElement = new DoublyLinkedList(value);
		newElement.next = element.next;
		newElement.prev = element;
		element.next = newElement;
		newElement.next.prev = newElement;
		return newElement;
	}
	
	public String toString() {
		String text = Integer.toString(value);
		if (next != null) {
			text += next.toString();
		}
		return text;
	}
}

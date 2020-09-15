package data_structures;

public class SinglyLinkedList {
	private int value;
	private SinglyLinkedList next;
	
	SinglyLinkedList(int value, SinglyLinkedList next) {
		this.value = value;
		this.next = next;
	}
	
	void insertAfter(int value, SinglyLinkedList element) {
		SinglyLinkedList newElement = new SinglyLinkedList(value, element.next);
		element.next = newElement;
	}
	
	public String toString() {
		String text = Integer.toString(value);
		if (next != null) {
			text = next.toString() + "," + text;
		}
		return text;
	}
}

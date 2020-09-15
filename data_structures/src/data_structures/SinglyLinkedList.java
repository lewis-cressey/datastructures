package data_structures;

public class SinglyLinkedList {
	private int value;
	private SinglyLinkedList next;
	
	SinglyLinkedList(int value) {
		this.value = value;
		this.next = null;
	}
	
	SinglyLinkedList insertAfter(int value) {
		SinglyLinkedList newElement = new SinglyLinkedList(value);
		this.next = newElement;
		return newElement;
	}
	
	public String toString() {
		String text = Integer.toString(value);
		if (next != null) {
			text += "," + next.toString();
		}
		return text;
	}
}

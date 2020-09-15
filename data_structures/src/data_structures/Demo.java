package data_structures;

public class Demo {
	public static void main(String[] args) {
		SinglyLinkedList head = new SinglyLinkedList(1);
		SinglyLinkedList tail = head;
		
		tail = tail.insertAfter(2);
		tail = tail.insertAfter(3);
		tail = tail.insertAfter(4);
		
		System.out.println(head);
	}
}

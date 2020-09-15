package data_structures;

public class Demo {
	public static void main(String[] args) {
		SinglyLinkedList list = null;
		
		list = new SinglyLinkedList(1, list);
		list = new SinglyLinkedList(2, list);
		list = new SinglyLinkedList(3, list);
		
		System.out.println(list);
	}
}

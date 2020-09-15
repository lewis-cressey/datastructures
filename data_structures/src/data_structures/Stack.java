package data_structures;

public class Stack {
	private int[] items = new int[100];
	private int size = 0;
	
	public void push(int value) {
		items[size] = value;
		size += 1;
	}
	
	public int pop() {
		size -= 1;
		return items[size];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}

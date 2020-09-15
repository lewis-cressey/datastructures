package data_structures;

public class Queue {
	private int[] items = new int[100];
	private int start = 0;
	private int end = 0;
	
	public void enqueue(int value) {
		items[end] = value;
		end = (end + 1) % 100;
	}
	
	public int dequeue() {
		int temp = start;
		start = (start + 1) % 100;
		return items[temp];
	}
	
	public boolean isEmpty() {
		return start == end;
	}
}

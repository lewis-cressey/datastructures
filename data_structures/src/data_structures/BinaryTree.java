package data_structures;

public class BinaryTree {
	String name;
	BinaryTree prev;
	BinaryTree next;
	
	BinaryTree(String name) {
		this.name = name;
		this.prev = null;
		this.next = null;
	}
	
	public BinaryTree add(String name) {
		// you write this!
	}
	
	public boolean contains(String name) {
		/* The compare method returns positive if name is alphabetically greater than this.name,
		 * or negative if name is before this.name, or 0 if they are equal.
		 */
		int compare = name.compareTo(this.name); 
		
		if (compare < 0) { // search left side of tree
			if (this.prev == null) return false; // reached bottom of tree
			return this.prev.contains(name); // recursive call
		}
		if (compare > 0) { // search right side of tree
			if (this.next == null) return false; // reached bottom of tree
			return this.next.contains(name); // recursive call
		}
		
		return true; // no need to search more... we have found the node!
	}
	
	public String toString() {
		String text = "";
		if (this.prev != null) {
			text += this.prev.toString() + ",";
		}
		text += this.name;
		if (this.next != null) {
			text += "," + this.next.toString();
		}
		return text;
	}
}

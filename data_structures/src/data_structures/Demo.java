package data_structures;

public class Demo {
	public static void main(String[] args) {
		BinaryTree maxim = new BinaryTree("Maxim");
		BinaryTree filip = new BinaryTree("Filip");
		maxim.prev = filip;
		BinaryTree szymon = new BinaryTree("Szymon");
		maxim.next = szymon;
		BinaryTree jan = new BinaryTree("Jan");
		filip.next = jan;
		System.out.println(maxim.toString());
	}
}

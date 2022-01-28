package Lec16;

public class Linked_List_Cycle {
	private class Node {

		int data;
		Node next;

		public Node(int item) {
			// TODO Auto-generated constructor stub
			this.data = item;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public void addFrist(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {

			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

	public void addLast(int item) {

		if (this.size == 0) {
			addFrist(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}

	}

	public void Crate_Cycle() {

		this.tail.next = this.head;
	}

	public void Display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public boolean hasCycle() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Linked_List_Cycle lc = new Linked_List_Cycle();
		lc.addLast(1);
		lc.addLast(2);
		lc.addLast(3);
		lc.addLast(4);
		lc.addLast(5);
		lc.addLast(6);
		lc.addLast(8);
		lc.Crate_Cycle();
		//lc.Display();
		System.out.println(lc.hasCycle());

	}

}

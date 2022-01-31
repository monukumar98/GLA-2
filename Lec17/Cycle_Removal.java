package Lec17;

public class Cycle_Removal {
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

	public void Crate_Cycle() throws Exception {

		this.tail.next = GetNode(2);
	}

	private Node GetNode(int k) throws Exception {

		if (k < 0 || k >= this.size) {
			throw new Exception("pgl hai kya sahi index bata");
		}

		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public Node Meetingpoint() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;

	}

	public void cycleremovel1() {
		Node meet = Meetingpoint();
		if (meet == null) {
			return;
		}
		Node start = this.head;
		while (start != null) {

			Node temp = meet;

			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;

				}
				temp = temp.next;
			}
			start = start.next;
		}

	}

	public void cycleremovel2() {
		Node meet = Meetingpoint();
		if (meet == null) {
			return;
		}
		// find number node in a cycle

		Node temp = meet;
		int count = 1;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}

		// Fast Pointer N Ahead from Slow
		Node fast = this.head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		Node slow = this.head;

		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public void FlyoedCycleRemoval() {
		Node meet = Meetingpoint();
		if (meet == null) {
			return;
		}
		Node temp = meet;
		Node slow = this.head;
		while (temp.next != slow.next) {
			slow = slow.next;
			temp = temp.next;
		}
		temp.next = null;

	}

	public void Display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal cr = new Cycle_Removal();
		cr.addLast(1);
		cr.addLast(2);
		cr.addLast(3);
		cr.addLast(4);
		cr.addLast(5);
		cr.addLast(6);
		cr.addLast(7);
		cr.addLast(8);
		cr.Crate_Cycle();
		cr.cycleremovel2();
		cr.Display();

	}
}

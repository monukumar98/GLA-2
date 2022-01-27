package Lec15;

public class LinkedList {

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

	public void addFirst(int item) {
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
			addFirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}

	}

	public void Addatindex(int k, int item) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("pgl hai kya sahi index bata");
		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node(item);
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;

		}

	}

	// get
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}

		return this.head.data;
	}

	public int getLAst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}

		return this.tail.data;
	}

	public int getatinedx(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}

		return GetNode(k).data;
	}

	// remove
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}

		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}
		return rv;

	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}
		if (this.size == 1) {
			return removeFirst();
		} else {
			int rv = this.tail.data;
			Node sln = GetNode(this.size - 2);
			sln.next = null;
			this.tail = sln;
			this.size--;
			return rv;

		}

	}

	public int removeatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Sun bhai LinkedList khali hai");
		}
		if (k < 0 || k >= this.size) {
			throw new Exception("pgl hai kya sahi index bata");
		}

		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removelast();
		}
		else {
			Node k_1th=GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			this.size--;
			return kth.data;
			
		}

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

	public void Display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}

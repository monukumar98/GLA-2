package Lec18;

import java.util.Scanner;

public class Binary_Tree {

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

	}

	Scanner sc = new Scanner(System.in);

	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		this.root = create_tree();
	}

	private Node create_tree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node(item);
		boolean hlc = sc.nextBoolean();

		if (hlc == true) {
			nn.left = create_tree();
		}

		boolean hrc = sc.nextBoolean();

		if (hrc == true) {
			nn.right = create_tree();
		}
		return nn;
	}

	public void Display() {
		Display(this.root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String str = "<--" + node.data + "-->";
		if (node.left != null) {
			str = node.left.data + str;
		} else {
			str = "." + str;
		}
		if (node.right != null) {
			str = str + node.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(node.left);
		Display(node.right);

	}

	public boolean find(int item) {
		return find(this.root, item);

	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		return find(node.left, item) || find(node.right, item);
	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int self_min = node.data;
		int left_min = min(node.left);
		int right_min = min(node.right);

		return Math.min(self_min, Math.min(left_min, right_min));
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub

		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

}

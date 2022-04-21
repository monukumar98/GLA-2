package Lec23;

public  class Binary_Search_tree {

	public class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	private Node root;

	public Binary_Search_tree(int in[]) {
		// TODO Auto-generated constructor stub
		this.root = Create_tree(in, 0, in.length - 1);

	}

	private Node Create_tree(int[] in, int lo, int hi) {
		if (hi < lo) {
			return null;
		}

		int mid = (lo + hi) / 2;

		Node node = new Node(in[mid]);
		node.left = Create_tree(in, lo, mid - 1);
		node.right = Create_tree(in, mid + 1, hi);
		return node;

	}

	public void Display() {
		Display(this.root);
		System.out.println();
	}

	private void Display(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		Display(node.left);
		Display(node.right);

	}

}

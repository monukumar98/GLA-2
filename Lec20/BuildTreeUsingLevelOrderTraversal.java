package Lec20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuildTreeUsingLevelOrderTraversal {

	private class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public BuildTreeUsingLevelOrderTraversal() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node nn = new Node(item);
		this.root = nn;
		q.add(nn);

		while (!q.isEmpty()) {

			Node rv = q.remove();

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node nl = new Node(c1);
				rv.left = nl;
				q.add(nl);
			}
			if (c2 != -1) {
				Node nr = new Node(c2);
				rv.right = nr;
				q.add(nr);
			}

		}

		return root;
	}

	public void display() {
		display_tree(this.root);
	}

	private void display_tree(Node root) {
		if (root == null)
			return;
		String str = root.data + "";
		if (root.left != null) {
			str = root.left.data + " <= " + str;
		} else {
			str = "END <= " + str;
		}

		if (root.right != null) {
			str = str + " => " + root.right.data;
		} else {
			str = str + " => END";
		}
		System.out.println(str);
		display_tree(root.left);
		display_tree(root.right);

	}

	public static void main(String[] args) {

		BuildTreeUsingLevelOrderTraversal blv = new BuildTreeUsingLevelOrderTraversal();
		blv.display();
	}

}

package Lec19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order {
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

	public Level_Order() {
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

	public void LevelOrder() {

		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			Node rn = q.remove();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				q.add(rn.left);
			}
			if (rn.right != null) {
				q.add(rn.right);
			}
		}

		System.out.println();

	}

	public void LevelOrder_Linewise() {

		Queue<Node> q = new LinkedList<>();
		Queue<Node> helper = new LinkedList<>();

		q.add(this.root);
		while (!q.isEmpty()) {
			Node rn = q.remove();
			System.out.print(rn.data + " ");
			if (rn.left != null) {
				helper.add(rn.left);
			}
			if (rn.right != null) {
				helper.add(rn.right);
			}

			if (q.isEmpty()) {
				q = helper;
				helper = new LinkedList<>();
				System.out.println();
			}
		}


	}

	public static void main(String[] args) {
		Level_Order lo = new Level_Order();
		// lo.LevelOrder();
		lo.LevelOrder_Linewise();

	}
//10 true 20 true 30 false true 50 false false true 60 false false true 70 true 90 false false true 110 false false
}

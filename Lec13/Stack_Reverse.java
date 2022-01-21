package Lec13;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		System.out.println("_______________________");
		System.out.println();
		reverse(s);

		System.out.println(s);
	}

	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}

		int item = s.pop();
		reverse(s);
		Insertbottom(s, item);

	}

	private static void Insertbottom(Stack<Integer> s, int item) {
		// TODO Auto-generated method stub
		if (s.isEmpty()) {
			s.push(item);
			return;
		}

		int i = s.pop();
		Insertbottom(s, item);
		s.push(i);

	}

}

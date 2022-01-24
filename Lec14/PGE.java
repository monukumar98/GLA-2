package Lec14;

import java.util.Stack;

public class PGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 4, 2, 20, 40, 12, 30 };
		prevGreaterElemet(arr);

	}

	public static void prevGreaterElemet(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 1; i < ans.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = arr[s.peek()];
			}

			s.push(i);

		}

		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}

package Lec14;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 20, 15, 32, 32,87, 24, 11 };
		//span_BT(arr);
		Span(arr);

	}

// o(n^2)
	public static void span_BT(int[] arr) {

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {

			int c = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] <= arr[i]) {
					c++;
				} else {
					break;
				}

			}
			ans[i] = c;

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);

		}

	}

	public static void Span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ans.length; i++) {

			while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}

			s.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);

		}
	}

}

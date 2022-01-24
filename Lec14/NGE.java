package Lec14;

import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 9, 13, 21, 3 };
		nextGreaterElemet(arr);

	}

	public static void nextGreaterElemet(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ans.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				ans[s.pop()] = arr[i];
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

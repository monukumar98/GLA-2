package Lec14;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int maxarea = 0;
		int i = 0;
		while (i < arr.length) {
			if (s.isEmpty() || arr[i] > arr[s.peek()]) {
				s.push(i);
				i++;
			} else {

				int h = arr[s.pop()];
				int r = i;

				if (s.isEmpty()) {
					int parea = h * r;
					maxarea = Math.max(maxarea, parea);
				}

				else {

					int l = s.peek();
					int parea = h * (r - l - 1);
					maxarea = Math.max(maxarea, parea);
				}

			}

		}

		while (!s.isEmpty()) {
			int h = arr[s.pop()];
			int r = i;

			if (s.isEmpty()) {
				int parea = h * r;
				maxarea = Math.max(maxarea, parea);
			}

			else {

				int l = s.peek();
				int parea = h * (r - l - 1);
				maxarea = Math.max(maxarea, parea);
			}

		}
		return maxarea;

	}

}

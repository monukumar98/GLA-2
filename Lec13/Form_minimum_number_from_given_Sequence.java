package Lec13;

import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DDIIDIID";
		Form_minimum_number(str);
		Form_minimum_number_Stack(str);

	}

	public static void Form_minimum_number(String str) {
		int[] ans = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				int j = i - 1;
				while (j >= 0 && str.charAt(j) == 'D') {
					ans[j] = count;
					count++;
					j--;
				}

			}

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static void Form_minimum_number_Stack(String str) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <= str.length(); i++) {
			s.push(i + 1);
			if (i == str.length() || str.charAt(i) == 'I') {
				while (!s.isEmpty()) {
					System.out.print(s.pop() + " ");
				}

			}

		}

		System.out.println();
	}
}

package Lec14;

import java.util.Stack;

public class Valid_Parentheses {
	public static void main(String[] args) {
		String str = "((){}[])[]";
		System.out.println(ValidParentheses(str));

	}

	public static boolean ValidParentheses(String str) {

		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char cch = str.charAt(i);

			if (cch == '(' || cch == '{' || cch == '[') {
				s.push(cch);

			}

			else {
				if (s.isEmpty()) {
					return false;
				} else {
					char topch = s.pop();
					if (topch == '(' && cch == ')') {
						continue;
					} else if (topch == '{' && cch == '}') {
						continue;
					} else if (topch == '[' && cch == ']') {
						continue;
					} else {
						return false;
					}

				}

			}

		}
		
		return s.isEmpty();

	}

}

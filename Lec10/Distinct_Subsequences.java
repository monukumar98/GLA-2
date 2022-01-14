package Lec10;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(noofways(s, t, 0, 0, dp));
	}
	// s --> coin and m--> index
	// t--> amount and n--> index

	public static int noofways(String s, String t, int m, int n, int[][] dp) {

		if (n == t.length()) {
			return 1;
		}

		if (m == s.length()) {
			return 0;
		}
		if (dp[m][n] != -1) {
			return dp[m][n];
		}
		int inc = 0;
		int exc = 0;

		if (s.charAt(m) == t.charAt(n)) {
			inc = noofways(s, t, m + 1, n + 1, dp);
		}

		exc = noofways(s, t, m + 1, n, dp);

		return dp[m][n] = inc + exc;

	}

}

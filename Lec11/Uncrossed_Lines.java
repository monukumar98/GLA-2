package Lec11;

import java.util.Arrays;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 5, 1, 2, 5 };
		int[] arr2 = { 10, 5, 2, 1, 5, 2 };
		int[][] dp = new int[arr1.length][arr2.length];

		for (int[] a : dp) {
			Arrays.fill(a, -1);

		}
		System.out.println(lcs(arr1, arr2, 0, 0, dp));
	}

	public static int lcs(int[] arr1, int arr2[], int i, int j, int[][] dp) {/// i-->arr1 and j-->arr2
		// base case
		if (i == arr1.length || j == arr2.length) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (arr1[i] == arr2[j]) {
			ans = 1 + lcs(arr1, arr2, i + 1, j + 1, dp);
		} else {
			int fs = lcs(arr1, arr2, i + 1, j, dp);
			int ss = lcs(arr1, arr2, i, j + 1, dp);
			ans = Math.max(fs, ss);

		}
		return dp[i][j] = ans;
	}

}

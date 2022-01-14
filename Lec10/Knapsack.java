package Lec10;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] cost = { 8, 4, 0, 5, 3 };
		int cap = 4;
		int[][] dp = new int[cap +1][wt.length];
		for(int [] a: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack_Problem(wt, cost, cap, 0, dp));

	}

	public static int Knapsack_Problem(int[] wt, int[] cost, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}

		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = cost[i] + Knapsack_Problem(wt, cost, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack_Problem(wt, cost, cap, i + 1, dp);

		return dp[cap][i] = Math.max(inc, exc);

	}

}

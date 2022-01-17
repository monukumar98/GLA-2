package Lec11;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];

		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid.length; i++) {

			int c = pathSum(grid, 0, i, dp);// (0,0),(0,1),(0,2)
			ans = Math.min(ans, c);

		}
		System.out.println(ans);
	}

	public static int pathSum(int[][] grid, int cr, int cc, int[][] dp) {
		// TODO Auto-generated method stub
		if(cr==grid.length-1) {
			return grid[cr][cc];
		}
		if(dp[cr][cc]!=Integer.MAX_VALUE) {
			return dp[cr][cc];
		}

		int ans = Integer.MAX_VALUE;
		for (int j = 0; j < grid[0].length; j++) {
			if (j != cc) {

				int res = pathSum(grid, cr + 1, j, dp);
				ans = Math.min(ans, res);
			}
		}

		return dp[cr][cc]=ans + grid[cr][cc];
	}

}

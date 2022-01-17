package Lec11;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];

		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			
			int c = pathSum(matrix, 0, i, dp);// (0,0),(0,1),(0,2)
			ans = Math.min(ans, c);

		}
		System.out.println(ans);

	}

	public static int pathSum(int[][] grid, int cr, int cc, int[][] dp) {

		if (cc < 0 || cc >= grid[0].length ) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}

		if (dp[cr][cc] != Integer.MAX_VALUE) {
			return dp[cr][cc];
		}
		// (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
		int p1 = pathSum(grid, cr + 1, cc - 1, dp);//1,-1
		int p2 = pathSum(grid, cr + 1, cc, dp);//1,0
		int p3 = pathSum(grid, cr + 1, cc + 1, dp);//1,1

		return dp[cr][cc] = (Math.min(p1, Math.min(p2, p3)) + grid[cr][cc]);

	}
}

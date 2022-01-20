package Lec12;

import java.util.Arrays;

public class Knight_Dialer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3131;
		int[][][] dp = new int[n + 1][4][3];

		for (int[][] ar : dp) {
			for (int[] a : ar) {
				Arrays.fill(a, -1);
			}
		}

//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				for (int j2 = 0; j2 < dp[i][j].length; j2++) {
//					dp[i][j][j2] = -1;
//
//				}
//
//			}
//
//		}

		int ans = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				ans = (ans + knightdialer(n - 1, i, j, dp)) % (1000_000_007);
			}

		}
		System.out.println(ans);

	}

	public static int knightdialer(int n, int cr, int cc, int[][][] dp) {

		// -ve base case

		if (cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
			return 0;
		}

		if (n == 0) {
			return 1;
		}

		if (dp[n][cr][cc] != -1) {
			return dp[n][cr][cc];
		}

		int r[] = { -2, -2, -1, -1, 1, 1, 2, 2 };
		int c[] = { -1, 1, -2, 2, -2, 2, -1, 1 };
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			count = (count + knightdialer(n - 1, cr + r[i], cc + c[i], dp)) % (1000_000_007);

		}
		return dp[n][cr][cc] = count;

	}

}

package Lec9;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		System.out.println(Noofways(n));
		int  [] dp = new int [n+1];

		System.out.println(NoofwaysDp(n, dp));

	}

	public static int Noofways(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		int fst = Noofways(n - 1);
		int sst = Noofways(n - 2);
		return fst + sst;

	}

	public static int NoofwaysDp(int n, int[] dp) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		// dp apply kroge
		if (dp[n] != 0) {
			return dp[n];
		}

		int fst = NoofwaysDp(n - 1, dp);
		int sst = NoofwaysDp(n - 2, dp);
		return dp[n] = fst + sst;// yaad kiye ho answer ko

	}

}

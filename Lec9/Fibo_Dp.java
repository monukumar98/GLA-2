package Lec9;

public class Fibo_Dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		//System.out.println(fib(n));
		long [] dp = new long [n+1];
		System.out.println(fibDp(n, dp));
		System.out.println(fibopdp(n));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fn1 = fib(n - 1);
		int fn2 = fib(n - 2);
		return fn1 + fn2;

	}
// O(N) Sp and O(N) TC
	public static long fibDp(int n, long[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		// dp apply kr rhe ho
		if (dp[n] != 0) {
			return dp[n];
		}
		long fn1 = fibDp(n - 1, dp);
		long fn2 = fibDp(n - 2, dp);
		dp[n] = fn1 + fn2;// yaad kiye ho answer ko 
		return fn1 + fn2;

	}
	
	public static int fibopdp(int n) {
		
		int a=0;
		int b=1;
		int i=1;
		while(i<=n) {
			int c = a+b;
			a=b;
			b=c;
			i++;
			
			
		}
		return a;
		
	}

}

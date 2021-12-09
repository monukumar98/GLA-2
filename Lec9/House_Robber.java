package Lec9;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 2 };
		System.out.println(robRec(arr, 0));
		int [] dp = new int [arr.length];
		Arrays.fill(dp, -1);
		System.out.println(RobDp(arr, 0, dp));
	    

	}

	public static int robRec(int[] arr, int i) {
		
		if(i>=arr.length) {
			return 0;
		}

		int ith_house_rob = arr[i] + robRec(arr, i + 2);
		int ith_house_not_rob = robRec(arr, i + 1);
		return Math.max(ith_house_not_rob, ith_house_rob);

	}

	public static int rob(int[] nums) {// Wrong Sol --->2,1,1,2
		int odd_sum = 0;
		int even_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 != 0) {
				odd_sum += nums[i];
			} else {
				even_sum += nums[i];
			}
		}
		return Math.max(odd_sum, even_sum);
	}
	
	public static int RobDp(int []arr,int i,int []dp) {
		if(i>=arr.length) {
			return 0;
		}
		
		
		// Dp Apply krenge
		if(dp[i]!=-1) {
			return dp[i];
		}
		
		
		int ith_house_rob = arr[i]+ RobDp(arr, i+2, dp);
		int ith_house_not_rob= RobDp(arr, i+1, dp);
		
		return dp[i]=Math.max(ith_house_not_rob, ith_house_rob);// ans yaad krke return kr rahe ho 
		
		
		
		
	}

}

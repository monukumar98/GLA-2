package Lec3;

public class Climbing_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(noways(0, n));
		noway_print(0, n, "");
		
	}

	public static int noways(int curr, int dis) {
		if (curr == dis) {
			return 1;
		}
		if (curr > dis) {
			return 0;
		}

//		int steps1 = noways(curr + 1, dis);
//		int steps2 = noways(curr + 2, dis);
//		int steps3 = noways(curr + 3, dis);
		int ans = 0;
		for (int step = 1; step <= 3; step++) {
			ans += noways(curr + step, dis);
		}

		return ans;

	}
	public static void  noway_print(int curr, int dis,String ans) {
		if (curr == dis) {
			System.out.println(ans);
			return;
		}
		if (curr > dis) {
			return ;
		}

//		int steps1 = noways(curr + 1, dis);
//		int steps2 = noways(curr + 2, dis);
//		int steps3 = noways(curr + 3, dis);
		
		for (int step = 1; step <= 3; step++) {
			noway_print(curr + step, dis,ans+step+",");
		}

		

	}

}

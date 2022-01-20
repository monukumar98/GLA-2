package Lec12;

import java.util.List;

public class Triangle_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumTotal_Rec(List<List<Integer>> triangle, int cr, int cc) {
		if (cr == triangle.size() - 1) {
			return triangle.get(cr).get(cc);
		}
		int c1 = minimumTotal_Rec(triangle, cr + 1, cc);// next row ke same col jaa raha hu (ith col)
		int c2 = minimumTotal_Rec(triangle, cr + 1, cc + 1);// next row ke (i+1)th col me jaa raha hu

		return Math.min(c1, c2) + triangle.get(cr).get(cc);

	}

}

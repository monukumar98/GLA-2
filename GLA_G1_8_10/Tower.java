package GLA_G1_8_10;

import java.util.ArrayList;
import java.util.List;

public class Tower {
	static List<Integer> A = new ArrayList<>();
	static List<Integer> B = new ArrayList<>();
	static List<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
//		TH(3, 'A', 'C', 'B');
		A = new ArrayList<>();
		B = new ArrayList<>();
		C = new ArrayList<>();

		A.add(3);
		A.add(2);
		A.add(1);
		TH_AL(3, A, C, B);
	}

	public static void TH(int n, char src, char dest, char help) {
		if (n == 0) {
			return;
		}
		// SP1:
		TH(n - 1, src, help, dest);
//		Move top disc from src to dest
		System.out.println("Move disc " + n + " from " + src + " to " + dest);
//		SP2: 
		TH(n - 1, help, dest, src);
	}

	public static void TH_AL(int n, List<Integer> src, List<Integer> dest, List<Integer> help) {
		if (n == 0) {
			return;
		}
		// SP1:
		TH_AL(n - 1, src, help, dest);
//		Move top disc from src to dest
//		System.out.println("Move disc " + n + " from " + src + " to " + dest);
		src.remove(src.size() - 1);
		dest.add(n);
		System.out.println(A + " == " + B + " == " + C);
//		SP2: 
		TH_AL(n - 1, help, dest, src);
	}
}

package Lec1;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);

	}

	public static void PD(int n) {
		// base case
		if (n == 0) {
			return;
		}

		System.out.println(n);// Apna work
		PD(n - 1);// Recursion

	}

}

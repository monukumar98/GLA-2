package Lec8;

public class TowerofHannio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		TOH(n, "src", "hlp", "dis");

	}

	public static void TOH(int n, String s, String h, String d) {

		if (n == 0) {
			return;
		}
		TOH(n - 1, s, d, h);
		System.out.println(n + "th Disk Move from " + s + " to " + d);
		TOH(n - 1, h, s, d);

	}

}

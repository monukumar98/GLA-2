package Lec2;

public class First_Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 20, 30, 40, 10, 20 };
		System.out.println(FirstIndex(arr, 20, 0));

	}

	public static int FirstIndex(int[] arr, int item, int i) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return FirstIndex(arr, item, i + 1);
	}
}

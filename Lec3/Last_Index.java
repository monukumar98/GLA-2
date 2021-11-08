package Lec3;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 20, 30, 40, 10, 20 };
		System.out.println(LastIndex(arr, 10, arr.length - 1));

	}

	public static int LastIndex(int[] arr, int item, int i) {

		if (i < 0) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}

		return LastIndex(arr, item, i - 1);
	}

}

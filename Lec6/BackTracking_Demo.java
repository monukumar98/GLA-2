package Lec6;

public class BackTracking_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		fun(arr, 0);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		
	}

	public static void fun(int[] arr, int i) {

		if (i == arr.length) {
			for (int idx = 0; idx < arr.length; idx++) {
				System.out.print(arr[idx]+" ");
			}

			return;
		}

		arr[i] = 10;//do
		fun(arr, i + 1);
		arr[i] =0;//undo

	}
	

}

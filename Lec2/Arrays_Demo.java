package Lec2;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         
//		int a;
//		int []arr=null;
//	System.out.println(arr);
//	
//	 arr= new int [5];
//	 
//	 for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i]+" ");
//	}
		int [] other = {100,200,300,400};
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + other[0]);
		//swap(arr[0], arr[1]);
		//swap1(arr, 0, 1);
		swap2(arr, other);
		
		System.out.println(arr[0] + " " + other[0]);

	}
	
	public static void swap2(int []arr,int [] other) {

		int [] t = arr;
		arr = other;
		other = t;
	}
		
	
	
	
	
	public static void swap1(int []arr,int i, int j) {

		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	
	public static void swap(int a, int b) {

		int t = a;
		a = b;
		b = t;
	}

}

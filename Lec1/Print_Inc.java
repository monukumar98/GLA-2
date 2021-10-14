package Lec1;


public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printinc(5);

	}
	public static void Printinc(int n) {
		if(n==0) {
			return;
		}
		
		
		Printinc(n-1);
		System.out.println(n);
	}

}

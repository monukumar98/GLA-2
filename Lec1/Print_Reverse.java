package Lec1;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverse("hello");

	}
	public static void printReverse(String str) {
		if(str.length()==0) {
			return;
		}
		printReverse(str.substring(1));
		char apnachar=str.charAt(0);
		//String ques=str.substring(1);
		System.out.println(apnachar);
	
		
	}

}

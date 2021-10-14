package Lec1;

public class String_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hellobye";
//		System.out.println(str.length());
//		System.out.println(str.charAt(2));
//		System.out.println(str.substring(2, 5));
		str.substring(1);
		System.out.println(str);
		printChar("nitik");

	}
	public static void printChar(String str) {
		if(str.length()==0) {
			return;
		}
		
		char apnachar=str.charAt(0);
		//String ques=str.substring(1);
		System.out.println(apnachar);
		printChar(str.substring(1));
		
	}

}

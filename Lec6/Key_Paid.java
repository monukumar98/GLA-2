package Lec6;

public class Key_Paid {

	static String[] getchar = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyPAid("198", "");

	}

	public static void KeyPAid(String ques, String ans) {// 198,""

		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);// '1'
		String key = getchar[ch - 48];// 1

		for (int i = 0; i < key.length(); i++) {

			KeyPAid(ques.substring(1), ans + key.charAt(i));
		}

	}

}

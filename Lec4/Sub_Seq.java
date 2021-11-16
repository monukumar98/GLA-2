package Lec4;

public class Sub_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Subseq(str, "");

	}

	public static void Subseq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if(Ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		char ch =Ques.charAt(0);
		Subseq(Ques.substring(1), ans);//no
		Subseq(Ques.substring(1), ans+ch);//yes
		
		
		

	}

}

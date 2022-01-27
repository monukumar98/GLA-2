package Lec15;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.age = 21;
		s.name = "Atul";
		Student s1 = new Student();
		s1.name = "vasu";
		s1.age = 20;
		s.fun();
		s1.fun();
		s.SayHey("Raju");
		s1.SayHey("Priya");

	}

}

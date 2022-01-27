package Lec15;

public class Student {
	int age;
	String name;

	public void fun() {

		System.out.println("hello fun my name is " + this.name + " and age is " + this.age);
	}

	public void SayHey(String name) {
		System.out.println(name + " sya hey " + this.name);

	}

}

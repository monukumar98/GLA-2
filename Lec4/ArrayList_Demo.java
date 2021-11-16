package Lec4;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println(".................");
		System.out.println(list.remove(1));
		System.out.println("...............");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		list.add(200);
		System.out.println(list);
		list.add(0, 500);
		System.out.println(".................");
		System.out.println(list);

		System.out.println(".................");

		// update

		list.set(2, -90);

		System.out.println(".................");
		System.out.println(list);

		System.out.println(".................");

	}

}

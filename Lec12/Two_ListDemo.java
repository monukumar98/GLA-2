package Lec12;

import java.util.*;

public class Two_ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {

			ArrayList<Integer> l = new ArrayList<>();
			l.add((i + 1) * 10);
			l.add((i + 1) * 20);
			l.add((i + 1) * 30);
			l.add((i + 1) * 40);
			l.add((i + 1) * 50);
			list.add(l);

		}
		System.out.println(list);
		
		for (int i = 0; i <list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j)+" ");
				
			}
			System.out.println();
			
		}

	}

}

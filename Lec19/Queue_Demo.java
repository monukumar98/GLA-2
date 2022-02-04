package Lec19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);//add last 
		ll.addLast(20);
		ll.add(30);
		System.out.println(ll.remove());// remove first
		
		// Stack 
		
		LinkedList<Integer> st = new LinkedList<>();
		st.addFirst(10);
		st.addFirst(20);
		st.addFirst(30);
		st.addFirst(40);
		System.out.println(st.remove());// remove first
		System.out.println(st);
		
		// Queue
	
		//Queue<Integer> qq = new Queue<>();
		List<Integer> l=new ArrayList<>();//
		List<Integer> li= new LinkedList<>();
		Queue<Integer> qq = new LinkedList<>();
		qq.add(10);//add last 
		qq.add(20);
		qq.add(30);
		System.out.println(qq.remove());// remove fisrt
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);
		System.out.println(queue.remove());
		
		

	}

}

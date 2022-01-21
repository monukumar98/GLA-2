package Lec13;

import java.util.*;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Stack<Integer> s = new Stack<>();
       
       // add  O(1)
       s.push(10);
       s.push(20);
       s.push(30);
       
       System.out.println(s);
       
       // peek value O(1)
       
       System.out.println(s.peek());
       
       // remove O(1)
       
       System.out.println(s.pop());
       System.out.println(s);
       
       System.out.println(s.isEmpty());
       
       System.out.println(s.size());
	}

}

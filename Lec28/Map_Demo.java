package Lec28;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();

		// add
		map.put("Raj", 89);
		map.put("Rahul", 79);
		map.put("Nikita", 68);
		map.put("Ankit", 48);
		map.put("Pooja", 77);
		map.put("Manish", 39);
		map.put("Amisha", 76);
		map.put("Riya", 59);
		map.put("Ankit", 78);
		//System.out.println(map);
		//1st way to print 
		Set<String> key = map.keySet();
		for(String k : key) {
			System.out.println(k+" "+map.get(k));
		}
		
		// 2nd way to print 
		
		
		for(String k : map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
		
		// 3rd ways
		
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		for(String k : ll) {
			System.out.println(k+" "+map.get(k));
		}
		
		

		// get
//		System.out.println(map.get("Amisha"));
//
//		// containsKey
//		System.out.println(map.containsKey("Rohan"));
//		System.out.println(map.containsKey("Raj"));
//
//		// remove
//		System.out.println(map.remove("Raj"));
//		// map.put(null, 90);
//		System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 89);
		map1.put("Rahul", 79);
		map1.put("Nikita", 68);
		map1.put("Ankit", 48);
		map1.put("Pooja", 77);
		map1.put("Manish", 39);
		map1.put("Amisha", 76);
		map1.put("Riya", 59);
		map1.put("Ankit", 78);
		//System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 89);
		map2.put("Rahul", 79);
		map2.put("Nikita", 68);
		map2.put("Ankit", 48);
		map2.put("Pooja", 77);
		map2.put("Manish", 39);
		map2.put("Amisha", 76);
		map2.put("Riya", 59);
		map2.put("Ankit", 78);
		//System.out.println(map2);

	}

}

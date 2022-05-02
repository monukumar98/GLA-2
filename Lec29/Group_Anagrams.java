package Lec29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			String key = GetKey(strs[i]);
			
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(strs[i]);
		
		}
		
		List<List<String>> ans = new ArrayList<>();
		for(String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;

	}

	public static String GetKey(String str) {

		int[] frq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch - 'a'] = frq[ch - 'a'] + 1;

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < frq.length; i++) {
			sb.append(frq[i]+" ");
		}

		return sb.toString();

	}

}

package com.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyCharacter {
	public static void main(String[] args) {
		String s = "aabababcbcdebifa";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		int max = Integer.MIN_VALUE;
//		int max = -1;
		System.out.println(max);
		Collection<Integer> values = hm.values();
		for (int value : values) {
			if(value>max) {
				max = value;
			}
		}
		System.out.println("Max : "+max);
		
		Set<Character> freq = hm.keySet();
		for (Character ch : freq) {
//			System.out.println(hm.get(ch));
			if(hm.get(ch)==max) {
				System.out.println("character is : "+ch);
			}
		}


	}
}


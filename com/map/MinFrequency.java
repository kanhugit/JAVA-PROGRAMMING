package com.map;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

public class MinFrequency {
	public static void main(String[] args) {
		String s = "abbababacdiejabadiwqprzsei";
		ArrayList<Character> al = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		for (Entry<Character, Integer> e : hm.entrySet()) {
			if(e.getValue()<min) {
				min = e.getValue();
			}
		}
//		System.out.println(min);
		
		for(Character ch : hm.keySet()) {
			if(hm.get(ch) == min) {
				al.add(ch);
			}
		}
		System.out.println("Min frequency characters is : "+al);
	}
}

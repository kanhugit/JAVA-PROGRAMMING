package com.map;

import java.util.HashMap;

public class WordOccurance {
	public static void main(String[] args) {
		String s = "This is the one of the This Is tTe one oF the thiS";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] words = s.split(" ");
		for(String word : words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
	}
}

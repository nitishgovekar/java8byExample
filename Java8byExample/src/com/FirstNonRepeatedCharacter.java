package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String name ="Nitish";

		char c = getFirstNonRepeatedCharacter(name);
		System.out.println(c);
	}

	private static char getFirstNonRepeatedCharacter(String name) {
		Map<Character, Integer> chars = new LinkedHashMap<>();

		//Computes value for each key 
		for(Character ch : name.toCharArray()) {
			chars.compute(ch, (k,v)-> (v == null) ? 1 :++v);
		}

		//checks value of each key in a set
		for(Map.Entry<Character, Integer> entry : chars.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return Character.MIN_VALUE;
	}

}

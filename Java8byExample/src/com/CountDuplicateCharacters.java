package com;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		/** 
		Call the String.chars() method on the original string. This will return IntStream. This IntStream contains an integer representation of the characters from the given string.
		
		Transform IntStream into a stream of characters via the mapToObj() method (convert the integer representation into the human-friendly character form).
	
		Finally, group the characters (Collectors.groupingBy()) and count them (Collectors.counting()).
		 */
		
		Map<Character, Long> result = new HashMap<Character, Long>();
		String str ="nitish";
		result = str.chars().mapToObj(s -> (char) s).collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(result);
	}
	

}

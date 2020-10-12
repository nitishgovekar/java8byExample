package com.streams.allmatch;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo2 {

	public static void main(String[] args) {

		List<String> list =Arrays.asList("Virat", "Rohit" , "Raina" ,"Dhoni");
		//Checks whether the first character is in UpperCase or Not
		boolean result = list.stream().allMatch(s->Character.isUpperCase(s.charAt(0)));
		System.out.println(result);
	}

}

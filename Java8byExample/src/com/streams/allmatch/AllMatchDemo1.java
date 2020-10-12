package com.streams.allmatch;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Virat","Rohit","Dhoni");
		//returns whether all elements of this stream match the provided predicate
		boolean result = list.stream().allMatch(s ->s.contains("i"));
		System.out.println(result);
	} 

}

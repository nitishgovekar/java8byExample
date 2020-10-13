package com.streams.filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo3 {

	public static void main(String args[]) {
		List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Return sum of the list for addition of integers in range
		System.out.println(lists.stream().filter(x -> x > 0).mapToInt(x -> x).sum());
	}
}
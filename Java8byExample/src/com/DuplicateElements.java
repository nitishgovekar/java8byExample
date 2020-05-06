package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/** 
 * Function.identiy() is a method that returns it's input argument in this case it's going to be name 
 * Collectors.counting() method is used to count the number of elements passed in the stream as the parameter 
 * It returns the total count of elements in the stream and return type is Long Object 
 */

public class DuplicateElements {
	
	public static void main (String ars[]) {
		
		String names[] = {"Java","Python","Ruby","Java","Ruby","Ruby"};
		
		List<String> list = Arrays.asList(names);
		
		Map<String, Long>result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		
		System.out.println(result);
	}

}


/** OUTPUT 
 * 
 *  {Java=2, Ruby=3, Python=1}
 * 
 */

